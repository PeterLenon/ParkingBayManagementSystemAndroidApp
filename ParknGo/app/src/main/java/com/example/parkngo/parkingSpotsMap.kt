package com.example.parkngo

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class parkingSpotsMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_spots_map)


        var imagePin = findViewById<ImageView>(/* id = */ R.id.TigerWorld)
        imagePin.setOnClickListener()
        {
            val intent = Intent(this,parkingBays::class.java)
            startActivity(intent)
        }



    }

}