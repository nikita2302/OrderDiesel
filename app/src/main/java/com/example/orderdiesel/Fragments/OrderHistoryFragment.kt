package com.example.orderdiesel.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orderdiesel.Adapters.OrderHistoryAdapter
import com.example.orderdiesel.R
import kotlinx.android.synthetic.main.fragment_order_history.view.*

class OrderHistoryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View? = inflater!!.inflate(R.layout.fragment_order_history, container, false)
        val recyclerView = view!!.findViewById(R.id.order_history_recycler_view) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(activity)

        recyclerView.order_history_recycler_view.adapter = OrderHistoryAdapter()
        return view

    }

}