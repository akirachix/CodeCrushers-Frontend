package com.akirachix.xomi_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.xomi_app.databinding.ActivityReccomendedBooksBinding

class Reccomended_books : AppCompatActivity() {
    lateinit var binding: ActivityReccomendedBooksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityReccomendedBooksBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_reccomended_books)


        val button3 = findViewById<TextView>(R.id.btSelect)
        button3.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        val button4 = findViewById<TextView>(R.id.btSelect1)
        button4.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        val button5 = findViewById<TextView>(R.id.btSelect3)
        button5.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        val button6 = findViewById<TextView>(R.id.btSelect4)
        button6.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }

        }
    }
