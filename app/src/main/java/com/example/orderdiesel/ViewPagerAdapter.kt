package com.example.orderdiesel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.orderdiesel.Fragments.HomeFragment
import com.example.orderdiesel.Fragments.OrderHistoryFragment
import com.example.orderdiesel.Fragments.OrderStatisticsFragment
import com.example.orderdiesel.Fragments.SettingsFragment

class ViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        return when (position) {
            0 -> HomeFragment()
            1 -> OrderStatisticsFragment()
            2 -> OrderHistoryFragment()
            3 -> SettingsFragment()
            else -> HomeFragment()
        }
    }

    /*override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Home"
            1 -> "Order Statistics"
            2 -> "Order History"
            3 -> "Settings"
            else -> return "Home"
        }
    }*/
}