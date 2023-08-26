package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageButton
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val intent = Intent(applicationContext,Home::class.java)
            startActivity(intent)
        }
    }
}

