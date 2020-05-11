package com.example.orderdiesel.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.orderdiesel.R
import com.example.orderdiesel.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = ViewPagerAdapter(supportFragmentManager)

        view_pager!!.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(view_pager)

        tabs_main.getTabAt(0)?.setIcon(R.drawable.home)
        tabs_main.getTabAt(1)?.setIcon(R.drawable.analytics)
        tabs_main.getTabAt(2)?.setIcon(R.drawable.history)
        tabs_main.getTabAt(3)?.setIcon(R.drawable.settings)
    }
}
