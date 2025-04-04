package com.example.activityexample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import com.example.activityexample.databinding.ActivityMain3Binding
import com.example.activityexample.databinding.ActivityMainBinding
import androidx.activity.result.contract.ActivityResultContracts


class ThirdActivity: ComponentActivity() {

    private lateinit var binding: ActivityMain3Binding
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root

         resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == 10) {
                val message = result.data?.getStringExtra("Message")
                println("Received Message: $message")

            }
        }

        binding.button3.setOnClickListener{
            val intent = Intent(this, FourthActivity::class.java)
            resultLauncher.launch(intent) // Start Activity and wait for result
        }

        setContentView(view)


    }
}