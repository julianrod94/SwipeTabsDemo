package me.julianrod.clapps.tab_menu

import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager

/**
 * Created by julianrodrigueznicastro on 14/08/2018.
 */
class MyTabSelectedListener(val viewPager: ViewPager) : TabLayout.OnTabSelectedListener {

    override fun onTabSelected(tab: TabLayout.Tab) {
        viewPager.currentItem = tab.getPosition()
    }

    override fun onTabUnselected(tab: TabLayout.Tab) {

    }

    override fun onTabReselected(tab: TabLayout.Tab) {

    }
}