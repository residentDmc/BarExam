package com.vesam.barexamlibrary.ui.view.adapter.category_list

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vesam.barexamlibrary.R
import java.util.*

class CategoryAdapter(private val context: Context) : RecyclerView.Adapter<ViewHolderCategory>() {

    private val list: ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategory =
        ViewHolderCategory(getViewHolder(parent))

    private fun getViewHolder(parent: ViewGroup): View = LayoutInflater.from(context)
        .inflate(R.layout.item_category, parent, false)

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolderCategory, position: Int) {
        val title = list[position]
        holder.txtTitle.text = title
    }

    override fun getItemCount(): Int = list.size

    fun updateList(listMyMessage: List<String>) {
        list.clear()
        list.addAll(listMyMessage)
        notifyDataSetChanged()
    }
}