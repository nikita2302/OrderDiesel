package com.example.orderdiesel.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orderdiesel.Adapters.OrderStatisticsAdapter
import com.example.orderdiesel.R
import kotlinx.android.synthetic.main.fragment_order_statistics.view.*
import org.json.JSONObject

class OrderStatisticsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View? = inflater!!.inflate(R.layout.fragment_order_statistics, container, false)
        val recyclerView = view!!.findViewById(R.id.order_statistics_recycler_view) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(activity)

        val orderStatistics= JSONObject()
        orderStatistics.put("Dec 19", "20")
        orderStatistics.put("Jan 20", "20")
        orderStatistics.put("Feb 20", "20")
        orderStatistics.put("March 20", "20")

        recyclerView.order_statistics_recycler_view.adapter = OrderStatisticsAdapter(orderStatistics)

        return view

    }

}