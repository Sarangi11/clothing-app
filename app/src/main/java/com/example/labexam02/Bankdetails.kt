package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Bankdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bankdetails)


        val nextButton9: Button = findViewById(R.id.save)
        val nextButton10: Button = findViewById(R.id.pay)
        val nextbutton6 : ImageButton = findViewById(R.id.navhome1)
        val nextbutton7 :ImageButton = findViewById(R.id.navprofile1)
        val nextbutton8 :ImageButton = findViewById(R.id.navcart1)


        nextButton9.setOnClickListener {
            val intent = Intent(this@Bankdetails, Profile::class.java)
            startActivity(intent)
        }

        nextButton10.setOnClickListener {
            val intent = Intent(this@Bankdetails, ShoppingCart::class.java)
            startActivity(intent)
        }

        nextbutton6.setOnClickListener{
            val intent = Intent(this@Bankdetails,Home::class.java)
            startActivity(intent)
        }
        nextbutton7.setOnClickListener{
            val intent = Intent(this@Bankdetails,Profile::class.java)
            startActivity(intent)
        }
        nextbutton8.setOnClickListener{
            val intent = Intent(this@Bankdetails,ShoppingCart::class.java)
            startActivity(intent)
        }
    }
}