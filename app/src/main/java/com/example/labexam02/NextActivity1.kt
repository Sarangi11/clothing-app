package com.example.labexam02


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NextActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next1)

        val nextButton1: Button = findViewById(R.id.get_started)

        nextButton1.setOnClickListener {
            val intent = Intent(this@NextActivity1, Home::class.java)
            startActivity(intent)
        }
    }
}
