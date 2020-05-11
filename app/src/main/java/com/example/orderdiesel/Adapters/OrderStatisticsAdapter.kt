package com.example.orderdiesel.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orderdiesel.R
import kotlinx.android.synthetic.main.order_statistics_row.view.*
import org.json.JSONObject

class OrderStatisticsAdapter(private val orderStatistics: JSONObject) : RecyclerView.Adapter<OrderStatisticsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderStatisticsAdapter.ViewHolder {
        val view = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.order_statistics_row, parent, false))
        return view
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var order:String
        if (position == 1) {
             order = orderStatistics.get("Dec 19") as String
        }
        if (position == 2) {
            order = orderStatistics.get("Jan 20") as String
        }
        if (position == 3) {
            order = orderStatistics.get("Feb 20") as String
        }
        else {
            order = orderStatistics.get("March 20") as String
        }


        holder.bindOrderStatistic(order)
    }

    override fun getItemCount() = orderStatistics.length()

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val tvMonth = view.month
        val tvQuantity = view.qty
        val tvAmount = view.amount

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")

            //Start a new activity
/*
            val context = itemView.context
            val showPhotoIntent = Intent(context, PhotoActivity::class.java)
            showPhotoIntent.putExtra(PHOTO_KEY, photo)
            context.startActivity(showPhotoIntent)*/
        }

        // This should be a JSON object
        fun bindOrderStatistic(order: String){
            tvAmount.text = order
            tvQuantity.text = "23.23"
           /* this.orderStatisticsJSONArray = orderStatisticsJSONArray
            Picasso.with(view.context).load(photo.url).into(view.itemImage)
            view.itemDate.text = photo.humanDate
            view.itemDescription.text = photo.explanation*/

        }
    }
}