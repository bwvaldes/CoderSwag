package com.example.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*
import java.util.zip.Inflater

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    override fun onBindViewHolder(p0: Holder, p1: Int) {
        p0?.bindCategory(categories[p1], context)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, p0, false)
        return Holder(view)    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image,
                    "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }

    }

}