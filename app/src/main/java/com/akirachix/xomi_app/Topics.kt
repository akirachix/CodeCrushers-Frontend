package com.akirachix.xomi_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.xomi_app.databinding.ActivitySubjectsBinding
import com.akirachix.xomi_app.databinding.ActivityTopicsBinding

class Topics : AppCompatActivity() {
    lateinit var binding: ActivityTopicsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTopicsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSubject.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        binding.tvTopic.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        binding.tvPlants.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        binding.textView4.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        binding.imageView5.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
        binding.textView5.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }

        binding.btResume.setOnClickListener {
            val intent = Intent(this,Subjects::class.java)
            startActivity(intent)
        }
        binding.btQuizz.setOnClickListener {
            val intent = Intent(this,Questions::class.java)
            startActivity(intent)
        }
        binding.btRestart.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }


    }
}