package com.sciencekom.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var bSubmit: Button
    lateinit var tvJudul: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bSubmit = findViewById(R.id.bSubmit)
        tvJudul = findViewById(R.id.tvJudul)

        var text_name = intent.getStringExtra("NAME")

        tvJudul.text = "Selamat Datang $text_name"

        bSubmit.setOnClickListener {
            Toast.makeText(this, "Tombol Berhasil di Klik", Toast.LENGTH_SHORT).show()
        }



    }



}


