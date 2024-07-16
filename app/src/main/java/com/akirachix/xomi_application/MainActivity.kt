package com.akirachix.xomi_app
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.akirachix.xomi_app.databinding.ActivityMainBinding
import com.akirachix.xomi_application.R
import com.akirachix.xomi_application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = findViewById<TextView>(R.id.btButton)
        button.setOnClickListener {
            val intent = Intent(this,Topics::class.java)
            startActivity(intent)
        }
    }
}