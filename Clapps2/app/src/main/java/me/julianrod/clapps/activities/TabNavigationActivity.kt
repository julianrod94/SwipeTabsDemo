package me.julianrod.clapps.activities

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_tab_navigation.*
import me.julianrod.clapps.R
import me.julianrod.clapps.R.layout.activity_tab_navigation
import me.julianrod.clapps.model.TopRankings
import me.julianrod.clapps.tab_menu.MyTabSelectedListener
import me.julianrod.clapps.tab_menu.TabsAdapter


class TabNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_tab_navigation)

        val tabLayout = tab_layout as TabLayout
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE

        //Add all tabs based on Ranking Categories with its respective name and circle color
        TopRankings.values().forEach {
            var textView = layoutInflater.inflate(R.layout.tab_view, null) as TextView
            textView.text = it.rankingName
            textView.setCompoundDrawablesWithIntrinsicBounds(null, null, getDrawable(it.circle), null)
            tabLayout.addTab(tabLayout.newTab().setCustomView(textView))
        }

        val viewPager = pager as ViewPager
        val adapter = TabsAdapter(supportFragmentManager, tabLayout.getTabCount())
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(MyTabSelectedListener(viewPager))
    }
}
