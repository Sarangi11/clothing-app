package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val nextButton3: ImageButton = findViewById(R.id.profile)
        val nextButton4: ImageButton = findViewById(R.id.blo1)
        val nextbutton6 : ImageButton = findViewById(R.id.navhome1)
        val nextbutton7 :ImageButton = findViewById(R.id.navprofile1)
        val nextbutton8 :ImageButton = findViewById(R.id.navcart1)

        nextButton3.setOnClickListener {
            val intent = Intent(this@Home, Profile::class.java)
            intent.putExtra("key", "value") // Add any necessary extras
            startActivity(intent)
        }

        nextButton4.setOnClickListener {
            val intent = Intent(this@Home, About::class.java)
            startActivity(intent)
        }

        nextbutton6.setOnClickListener{
            val intent = Intent(this@Home,Home::class.java)
            startActivity(intent)
        }
        nextbutton7.setOnClickListener{
            val intent = Intent(this@Home,Profile::class.java)
            startActivity(intent)
        }
        nextbutton8.setOnClickListener{
            val intent = Intent(this@Home,ShoppingCart::class.java)
            startActivity(intent)
        }
    }
}
