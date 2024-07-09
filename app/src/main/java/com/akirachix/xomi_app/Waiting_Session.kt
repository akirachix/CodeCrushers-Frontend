package com.akirachix.xomi_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.xomi_app.databinding.ActivityReccomendedBooksBinding
import com.akirachix.xomi_app.databinding.ActivityWaitingSessionBinding

class Waiting_Session : AppCompatActivity() {
    lateinit var binding: ActivityWaitingSessionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWaitingSessionBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_waiting_session)

        val button = findViewById<TextView>(R.id.btEnd)
        button.setOnClickListener {
            val intent = Intent(this,Questions::class.java)
            startActivity(intent)
        }
    }
}