package com.example.labexam02


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val nextButton11: Button = findViewById(R.id.editprofile)
        val nextButton12: Button = findViewById(R.id.bank)
        val nextButton13: Button = findViewById(R.id.shoppin)
        val nextbutton6 : ImageButton = findViewById(R.id.navhome1)
        val nextbutton7 : ImageButton = findViewById(R.id.navprofile1)
        val nextbutton8 : ImageButton = findViewById(R.id.navcart1)


        nextButton11.setOnClickListener {
            val intent = Intent(this@Profile, Register::class.java)
            startActivity(intent)
        }

        nextButton12.setOnClickListener {
            val intent = Intent(this@Profile, Bankdetails::class.java)
            startActivity(intent)
        }
        nextButton13.setOnClickListener {
            val intent = Intent(this@Profile, ShoppingCart::class.java)
            startActivity(intent)
        }

        nextbutton6.setOnClickListener{
            val intent = Intent(this@Profile,Home::class.java)
            startActivity(intent)
        }
        nextbutton7.setOnClickListener{
            val intent = Intent(this@Profile,Profile::class.java)
            startActivity(intent)
        }
        nextbutton8.setOnClickListener{
            val intent = Intent(this@Profile,ShoppingCart::class.java)
            startActivity(intent)
        }
    }
}