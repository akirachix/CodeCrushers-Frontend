package com.akirachix.xomi_application

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.xomi_application.databinding.ActivitySubjectsBinding


class subjects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding=ActivitySubjectsBinding.inflate(layoutInflater)

            setContentView(binding.root)
            val button = findViewById<TextView>(R.id.btView1)
            button.setOnClickListener {
                val intent = Intent(this,subjects::class.java)
                startActivity(intent)
            }
            val button1 = findViewById<TextView>(R.id.btView2)
            button1.setOnClickListener {
                val intent = Intent(this,subjects::class.java)
                startActivity(intent)
            }
            val button2 = findViewById<TextView>(R.id.btView3)
            button2.setOnClickListener {
                val intent = Intent(this,subjects::class.java)
                startActivity(intent)
            }
            val button3 = findViewById<TextView>(R.id.btView4)
            button3.setOnClickListener {
                val intent = Intent(this,subjects::class.java)
                startActivity(intent)
            }
            val button4 = findViewById<TextView>(R.id.btBack)
            button4.setOnClickListener {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }