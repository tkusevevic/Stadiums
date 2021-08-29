package com.amaricevic.stadiums.ui.stadiums

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.constants.STADIUM_KEY
import com.amaricevic.stadiums.commons.extensions.hide
import com.amaricevic.stadiums.commons.extensions.show
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.presentation.AllStadiumsPresenter
import com.amaricevic.stadiums.topRatedPresenter
import com.amaricevic.stadiums.ui.listeners.OnItemClickListener
import com.amaricevic.stadiums.ui.stadium_details.StadiumDetailsActivity
import com.amaricevic.stadiums.ui.stadiums.adapter.AllStadiumsAdapter
import com.amaricevic.stadiums.ui.stadiums.views.AllStadiumsView
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

