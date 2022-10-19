package com.sciencekom.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FrontActivity : AppCompatActivity() {
    lateinit var bStart:Button
    lateinit var etName:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)
        supportActionBar?.hide()

        bStart = findViewById(R.id.bStart)
        etName = findViewById(R.id.etName)

        bStart.setOnClickListener {
            checkTextName()
        }

    }

    fun checkTextName(){
        if(etName.text.toString() == "" || etName.text.toString() == null ){
            Toast.makeText(this, "Mohon Lengkapi Nama Anda", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Memulai Program untuk ${etName.text}", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("NAME", etName.text.toString())
            etName.setText("")
            startActivity(intent)
        }
    }
}