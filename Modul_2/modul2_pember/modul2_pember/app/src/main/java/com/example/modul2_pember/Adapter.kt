package com.example.modul2_pember

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context: Context, private val iitem: List<item>, val listener: (item) -> Unit)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val img_item = view.findViewById<ImageView>(R.id.img_photo)
        val name_item = view.findViewById<TextView>(R.id.tv_name)

        fun bindView(AIthing: item, listener: (item) -> Unit) {
            img_item.setImageResource(AIthing.imgitem)
            name_item.text = AIthing.nameitem

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        )
    }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindView(iitem[position], listener)
        }

        override fun getItemCount(): Int = iitem.size
    }

    fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }