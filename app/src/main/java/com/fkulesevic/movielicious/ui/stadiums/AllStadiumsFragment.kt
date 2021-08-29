package com.fkulesevic.movielicious.ui.stadiums

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.constants.STADIUM_KEY
import com.fkulesevic.movielicious.commons.extensions.hide
import com.fkulesevic.movielicious.commons.extensions.show
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.presentation.AllStadiumsPresenter
import com.fkulesevic.movielicious.topRatedPresenter
import com.fkulesevic.movielicious.ui.listeners.OnItemClickListener
import com.fkulesevic.movielicious.ui.stadium_details.StadiumDetailsActivity
import com.fkulesevic.movielicious.ui.stadiums.adapter.AllStadiumsAdapter
import com.fkulesevic.movielicious.ui.stadiums.views.AllStadiumsView
import kotlinx.android.synthetic.main.fragment_all_stadiums.*

class AllStadiumsFragment : Fragment(), OnItemClickListener, AllStadiumsView {

    private val presenter: AllStadiumsPresenter by lazy { topRatedPresenter() }

    private val adapter by lazy { AllStadiumsAdapter(this) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_all_stadiums, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.setBaseview(this)
        loadFavorites()
        initRecyclerView()
        loadAllStadiums()
    }

    private fun initRecyclerView() {
        recyclerViewTopRated.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewTopRated.layoutManager = lm
    }

    private fun loadFavorites() = presenter.getFavorites()

    private fun loadAllStadiums() = presenter.getStadiums()

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

    override fun addStadions(stadiums: List<Stadium>) = adapter.addItems(stadiums)

    override fun setStadiums(stadiums: List<Stadium>) = adapter.setItems(stadiums)

    override fun setFavorites(favorites: List<Stadium>) = adapter.setFavorite(favorites)

    override fun showMessageEmptyList() = noStadiums.show()

    override fun hideMessageEmptyList() = noStadiums.hide()
}

