package com.example.parkngo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class parkingBays : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_bays)
        var parkButton: Button = findViewById(R.id.parkButton)

        parkButton.setOnClickListener()
        {
            val intent : Intent = Intent(this, carparkview::class.java)
            startActivity(intent)
        }
    }
}