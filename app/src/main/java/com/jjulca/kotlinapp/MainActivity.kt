package com.jjulca.kotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jjulca.kotlinapp.databinding.ActivityMainBinding

/**
 * @author Janett Julca
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}