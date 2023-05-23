package com.cibesth.medtech.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibesth.medtech.models.MedTech

class ListOfRemediesAdapter: RecyclerView.Adapter<ListOfRemediesAdapter.RemedyViewHolder>() {
    inner class RemedyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameView = itemView.findViewById<TextView>(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RemedyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return RemedyViewHolder(view)
    }

    override fun getItemCount(): Int {
       return MedTech.tabletHolder.size
    }

    override fun onBindViewHolder(holder: RemedyViewHolder, position: Int) {
        MedTech.tabletHolder[position]
            holder.nameView.text = MedTech.tabletHolder[position].name
    }

}