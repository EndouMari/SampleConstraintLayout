package com.example.android.sampleconstraintlayou

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout.setupWithViewPager(viewPager.apply {
            offscreenPageLimit = 3
            val adapter = TabPagerAdapter(supportFragmentManager, context).apply {
                add(Fragment1::class.java, Bundle(), getString(R.string.tab_1))
                add(Fragment2::class.java, Bundle(), getString(R.string.tab_2))
                add(Fragment3::class.java, Bundle(), getString(R.string.tab_3))
            }
            this.adapter = adapter
        })
    }
}

class TabPagerAdapter(fragmentManager: FragmentManager, private val context: Context) : FragmentStatePagerAdapter(fragmentManager) {
    private val tabs: MutableList<Tab> = mutableListOf()

    override fun getItem(position: Int): Fragment {
        val tab = tabs[position]
        return Fragment.instantiate(context, tab.fragment.name, tab.args)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return tabs[position].title
    }

    override fun getCount(): Int {
        return tabs.size
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

    fun add(fragment: Class<out Fragment>, args: Bundle?, title: CharSequence) {
        tabs.add(Tab(fragment, args, title))
    }

    private class Tab(val fragment: Class<out Fragment>, val args: Bundle?, val title: CharSequence)
}
