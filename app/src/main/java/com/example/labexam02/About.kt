package com.example.labexam02


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val nextbutton5 :Button = findViewById(R.id.addtocart)

        val nextbutton6 : ImageButton = findViewById(R.id.navhome1)
        val nextbutton7 :ImageButton = findViewById(R.id.navprofile1)
        val nextbutton8 :ImageButton = findViewById(R.id.navcart1)

        nextbutton5.setOnClickListener{
            val intent = Intent(this@About,ShoppingCart::class.java)
            startActivity(intent)
        }
        nextbutton6.setOnClickListener{
            val intent = Intent(this@About,Home::class.java)
            startActivity(intent)
        }
        nextbutton7.setOnClickListener{
            val intent = Intent(this@About,Profile::class.java)
            startActivity(intent)
        }
        nextbutton8.setOnClickListener{
            val intent = Intent(this@About,ShoppingCart::class.java)
            startActivity(intent)
        }

    }
}