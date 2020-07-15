package com.trinitydigital.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val list = arrayListOf<InstaExampleModel>()
        for (i in 1..1000) {
            list.add(InstaExampleModel("title $i", "13/12/19$i", getImageID(i)))
//            list.add("item number $i")
        }

        val adapter = PhoneAdapter(list)

        recyclerView?.adapter = adapter

    }

    private fun getImageID(position: Int): Int {
        val result = position % 4
        var image: Int = 0

        when (result) {
            0 -> image = R.drawable.ic_mario
            1 -> image = R.drawable.secong
            2 -> image = R.drawable.third
            3 -> image = R.drawable.download
        }

        return image
    }
}