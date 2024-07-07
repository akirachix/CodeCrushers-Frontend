package com.akirachix.xomi_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.xomi_app.databinding.ActivityQuestionsBinding
import com.akirachix.xomi_app.databinding.ActivitySubjectsBinding

class Questions : AppCompatActivity() {
    lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_questions)

        val submit = findViewById<Button>(R.id.btSubmit)
        submit.setOnClickListener {
            val intent = Intent(this, Topics::class.java)
            startActivity(intent)
        }
    }
}
