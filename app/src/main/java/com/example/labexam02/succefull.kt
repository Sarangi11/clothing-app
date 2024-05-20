package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class succefull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succefull)


        val nextButton16: Button = findViewById(R.id.home111)

        nextButton16.setOnClickListener {
            val intent = Intent(this@succefull, Home::class.java)
            startActivity(intent)
        }
    }

}