package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nextButton14: Button = findViewById(R.id.submit3)
        val nextbutton6 : ImageButton = findViewById(R.id.navhome1)
        val nextbutton7 : ImageButton = findViewById(R.id.navprofile1)
        val nextbutton8 : ImageButton = findViewById(R.id.navcart1)




        nextButton14.setOnClickListener {
            val intent = Intent(this@Register, Profile::class.java)
            startActivity(intent)
        }

        nextbutton6.setOnClickListener{
            val intent = Intent(this@Register,Home::class.java)
            startActivity(intent)
        }
        nextbutton7.setOnClickListener{
            val intent = Intent(this@Register,Profile::class.java)
            startActivity(intent)
        }
        nextbutton8.setOnClickListener{
            val intent = Intent(this@Register,ShoppingCart::class.java)
            startActivity(intent)
        }
    }
}