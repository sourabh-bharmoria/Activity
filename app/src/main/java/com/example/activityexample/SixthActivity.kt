package com.example.activityexample

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.activityexample.databinding.ActivitySixthBinding

class SixthActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySixthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySixthBinding.inflate(layoutInflater)

        val Name = intent.getStringExtra("name")
        val Email = intent.getStringExtra("email")

        val Text1 = binding.EditText1
        val Text2 = binding.EditText2

        Text1.setText(Name)
        Text2.setText(Email)

        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this,FifthActivity::class.java)
            intent.putExtra("updatedName",Text1.text.toString())
            intent.putExtra("updatedEmail",Text2.text.toString())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }

    }


}