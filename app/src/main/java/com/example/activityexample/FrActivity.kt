package com.example.activityexample

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.activityexample.databinding.ActivityMain5Binding

class FrActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain5Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val firstFra = FirstFragment()
        val secFra = SecondFragment()


        binding.btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_view,firstFra)
                commit()
            }
        }

        binding.btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_view,secFra)
                commit()
            }
        }

    }


}