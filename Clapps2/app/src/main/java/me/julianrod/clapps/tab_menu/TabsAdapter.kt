package me.julianrod.clapps.tab_menu

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import me.julianrod.clapps.tab_menu.fragments.TabFragment1
import me.julianrod.clapps.tab_menu.fragments.TabFragment2

class TabsAdapter(fm: FragmentManager, var mNumOfTabs: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> {
                return TabFragment1()
            }
            1 -> {
                return TabFragment2()
            }
            2 -> {
                return TabFragment1()
            }
            3 -> {
                return TabFragment2()
            }
            4 -> {
                return TabFragment1()
            }
            else -> return null
        }
    }

    override fun getCount(): Int {
        return mNumOfTabs
    }
}