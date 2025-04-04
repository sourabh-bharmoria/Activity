package com.example.activityexample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResult
import com.example.activityexample.databinding.ActivityMain4Binding

class FourthActivity: ComponentActivity() {

    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        val view = binding.root

        binding.button4.setOnClickListener{
            val resultIntent = Intent()
            resultIntent.putExtra("Message","This is the result")
            setResult(10,resultIntent)
            finish()
        }
        setContentView(view)

    }
}