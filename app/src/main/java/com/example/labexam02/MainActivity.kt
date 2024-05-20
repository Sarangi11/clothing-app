package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton: Button = findViewById(R.id.next)

        nextButton.setOnClickListener {
            val intent = Intent(this@MainActivity, NextActivity1::class.java)
            startActivity(intent)
        }
    }
}
