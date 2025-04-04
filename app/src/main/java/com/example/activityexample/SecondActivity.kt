package com.example.activityexample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.activityexample.databinding.ActivityMain2Binding
import com.example.activityexample.databinding.ActivityMainBinding

class SecondActivity : ComponentActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root

        //getStringExtra is used to receive the sended data from one activity.
        val username = intent.getStringExtra("Name")
        println("App is being used by" +username)
        setContentView(view)
        println("onCreate2()")
       // val button2 = findViewById<Button>(R.id.button2)
        binding.button2.setOnClickListener {
            //finish() // Removes SecondActivity from the back stack
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
    }
}