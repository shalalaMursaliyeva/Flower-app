package com.example.flowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.flowers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var arrayListOfFLowers : ArrayList<FlowerItem>
    private lateinit var gridView : GridView
    private lateinit var flowerAdapter: FlowerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gridView = binding.gridViewFlower
        arrayListOfFLowers = flowerData()
        flowerAdapter = FlowerAdapter(applicationContext, arrayListOfFLowers)

        gridView.adapter = flowerAdapter


    }

    fun flowerData() : ArrayList<FlowerItem> {
        var flower: ArrayList<FlowerItem> = ArrayList()
        flower.add(FlowerItem("poppy", R.drawable.poppy))
        flower.add(FlowerItem("lilac", R.drawable.lilacs))
        flower.add(FlowerItem("flower", R.drawable.flower))
        flower.add(FlowerItem("poppy", R.drawable.poppy))
        flower.add(FlowerItem("lilac", R.drawable.lilacs))
        flower.add(FlowerItem("flower", R.drawable.flower))
        flower.add(FlowerItem("poppy", R.drawable.poppy))
        flower.add(FlowerItem("lilac", R.drawable.lilacs))
        flower.add(FlowerItem("flower", R.drawable.flower))
        flower.add(FlowerItem("poppy", R.drawable.poppy))
        flower.add(FlowerItem("lilac", R.drawable.lilacs))
        flower.add(FlowerItem("flower", R.drawable.flower))
        flower.add(FlowerItem("poppy", R.drawable.poppy))
        flower.add(FlowerItem("lilac", R.drawable.lilacs))
        flower.add(FlowerItem("flower", R.drawable.flower))

        return flower
    }


}