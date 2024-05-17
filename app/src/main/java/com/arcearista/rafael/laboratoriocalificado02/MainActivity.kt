package com.arcearista.rafael.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.arcearista.rafael.laboratoriocalificado02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener {
            binding.viewGreen.visibility = View.VISIBLE
        }

        binding.btnHide.setOnClickListener {
            binding.viewGreen.visibility = View.GONE
        }
    }
}