package com.trinitydigital.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_phones.view.*

class PhoneAdapter(private val array: ArrayList<InstaExampleModel>) :
    RecyclerView.Adapter<PhoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_phones, parent, false)
        val holder = PhoneViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}

class PhoneViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: InstaExampleModel) {
        itemView.tvTitle.text = item.title
        itemView.tvDate.text = item.date
        itemView.image.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.imageRes))
    }
}