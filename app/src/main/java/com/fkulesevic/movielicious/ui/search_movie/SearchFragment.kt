package com.fkulesevic.movielicious.ui.search_movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.constants.STADIUM_KEY
import com.fkulesevic.movielicious.commons.extensions.onClick
import com.fkulesevic.movielicious.commons.extensions.onTextChange
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.searchPresenter
import com.fkulesevic.movielicious.presentation.StadiumSearchPresenter
import com.fkulesevic.movielicious.ui.listeners.OnItemClickListener
import com.fkulesevic.movielicious.ui.stadium_details.StadiumDetailsActivity
import com.fkulesevic.movielicious.ui.stadiums.adapter.AllStadiumsAdapter
import kotlinx.android.synthetic.main.activity_search.*

class SearchFragment : Fragment(), OnItemClickListener, SearchView {

    private val adapter by lazy { AllStadiumsAdapter(this) }

    private val presenter: StadiumSearchPresenter by lazy { searchPresenter() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.setBaseview(this)
        initRecyclerView()
        initListener()
        setAllStadiums()
    }

    private fun initListener() {
        clearSearch.onClick {
            searchInput.text.clear()
            presenter.clearList()
        }

        searchInput.onTextChange {
            presenter.getStadiums(searchInput.text.toString())
            if (searchInput.text.toString().isEmpty() || searchInput.text.toString().isBlank()) {
                presenter.clearList()
            }
        }
    }

    private fun setAllStadiums() {
        presenter.setAllStadiums()
    }

    private fun initRecyclerView() {
        recyclerViewSearch.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewSearch.layoutManager = lm
    }

    override fun setStadiums(stadiums: List<Stadium>) = adapter.setItems(stadiums)

    override fun onStadiumClick(stadium: Stadium) {
        val bundle = Bundle()
        bundle.putSerializable(STADIUM_KEY, stadium)
        val intent = Intent(activity, StadiumDetailsActivity::class.java).putExtras(bundle)
        startActivity(intent)
    }

    override fun onLikeClick(stadium: Stadium) {
        presenter.onLikeTapped(stadium)
        adapter.setStadiumLiked(stadium.id, stadium.isLiked)
    }

    override fun addStadiums(stadiums: List<Stadium>) = adapter.addItems(stadiums)

    override fun setFavorites(favorites: List<Stadium>) = adapter.setFavorite(favorites)

    override fun clearList() = adapter.clearItems()
}