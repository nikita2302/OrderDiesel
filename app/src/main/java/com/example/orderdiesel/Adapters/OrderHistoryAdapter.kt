package com.example.orderdiesel.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orderdiesel.R
import kotlinx.android.synthetic.main.order_history_row.view.*

class OrderHistoryAdapter() : RecyclerView.Adapter<OrderHistoryAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderHistoryAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.order_history_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       if (position == 0) {
           holder.tvHeader.visibility = View.VISIBLE
           holder.tvHeader.setText(R.string.upcoming_order)
       } else if (position == 3) {
           holder.tvHeader.visibility = View.VISIBLE
           holder.tvHeader.setText(R.string.past_order)
       } else {
           holder.tvHeader.visibility = View.GONE
       }
        holder.tvDate.text = "2020-01-20"
        holder.tvAmount.text = "1400"
        holder.tvQuantity.text = "20"
        //holder.bindOrderStatistic(order)
    }

    override fun getItemCount() = 10

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val tvHeader = view.header
        val tvDate = view.date
        val tvQuantity = view.quantity
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
        fun bindOrderStatistic(order: String) {
            tvAmount.text = order
            tvQuantity.text = "23.23"
            /* this.orderStatisticsJSONArray = orderStatisticsJSONArray
             Picasso.with(view.context).load(photo.url).into(view.itemImage)
             view.itemDate.text = photo.humanDate
             view.itemDescription.text = photo.explanation*/

        }
    }
}