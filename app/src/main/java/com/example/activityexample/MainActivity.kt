package com.example.activityexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.activityexample.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
//Using ViewBinding to bind views
//ActivityMainBinding is a auto-generated class that corresponds to activity_main.xml
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)//This will create an instance of ActivityMainBinding Class

        //val layout = binding.root also does the same.
        setContentView(binding.root)//this gives the root view of the entire layout.
        //It refers to the layout of the activity_main.xml file.

        println("onCreate()")

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Name","Sourabh")
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        println("on Start()")
    }

    override fun onResume() {
        super.onResume()
        println("on Resume()")
    }

    override fun onPause() {
        super.onPause()
        println("onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy()")
    }
}

