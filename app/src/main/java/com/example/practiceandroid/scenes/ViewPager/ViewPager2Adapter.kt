package com.example.practiceandroid.scenes.ViewPager

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter(private val items: List<String>) : RecyclerView.Adapter<PagerViewHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(text:String) {

    }
}
