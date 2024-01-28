package com.example.flowers

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlowerAdapter(var context: Context, var flowerItems: ArrayList<FlowerItem>): BaseAdapter() {
    override fun getCount(): Int {
        return flowerItems.size
    }

    override fun getItem(p0: Int): Any {
        return flowerItems[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = View.inflate(context, R.layout.flower_item, null)
        var image: ImageView = view.findViewById(R.id.image_item)
        var flowerText: TextView = view.findViewById(R.id.item_text)
        var flowers: FlowerItem = flowerItems.get(p0)
        flowerText.text = flowers.name
        image.setImageResource(flowers.image)

        return view
    }
}