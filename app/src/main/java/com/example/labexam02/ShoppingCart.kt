package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ShoppingCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart)

        val nextButton15: Button = findViewById(R.id.checkout)
        val nextbutton6 : ImageButton = findViewById(R.id.navhome1)
        val nextbutton7 : ImageButton = findViewById(R.id.navprofile1)
        val nextbutton8 : ImageButton = findViewById(R.id.navcart1)




        nextButton15.setOnClickListener {
            val intent = Intent(this@ShoppingCart, succefull::class.java)
            startActivity(intent)
        }

        nextbutton6.setOnClickListener{
            val intent = Intent(this@ShoppingCart,Home::class.java)
            startActivity(intent)
        }
        nextbutton7.setOnClickListener{
            val intent = Intent(this@ShoppingCart,Profile::class.java)
            startActivity(intent)
        }
        nextbutton8.setOnClickListener{
            val intent = Intent(this@ShoppingCart,ShoppingCart::class.java)
            startActivity(intent)
        }
    }
}