package me.julianrod.clapps.model

import me.julianrod.clapps.R

/**
 * Created by julianrodrigueznicastro on 15/08/2018.
 */
enum class TopRankings(val rankingName: String, val circle: Int) {
    TOP_FREE("TOP FREE", R.drawable.ic_circle_blue),
    TOP_PAID("TOP PAID", R.drawable.ic_circle_red),
    TOP_NEW_FREE("TOP NEW FREE", R.drawable.ic_circle_yellow),
    TOP_NEW_PAID("TOP NEW PAID", R.drawable.ic_circle_pink),
    TOP_GROSSING("TOP GROSSING", R.drawable.ic_circle_orange);
}