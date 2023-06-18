package com.example.conversordetemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversordetemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.botaoResultado.setOnClickListener {
           val celsius = binding.grausCelsius.text.toString().toDouble()
           val fire = celsius * 1.8 + 32

           binding.tempFire.text = "°F $fire"

       }
    }
}