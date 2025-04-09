package com.example.activityexample

import android.app.Activity
import android.os.Bundle
import android.widget.EditText
import android.content.Intent
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.activityexample.databinding.ActivityFifthBinding

class FifthActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    val result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->

        if(result.resultCode == Activity.RESULT_OK){
            val updatedName = result.data?.getStringExtra("updatedName")
            val updatedEmail = result.data?.getStringExtra("updatedEmail")

            binding.TextView1.text = updatedName
            binding.TextView2.text = updatedEmail

            Toast.makeText(this,"Updated the Profile Successfully",Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Name = binding.TextView1
        val Email = binding.TextView2

        val button = binding.editButton


        button.setOnClickListener {
            val name = Name.text.toString()
            val email = Email.text.toString()

            val intent = Intent(this,SixthActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("email",email)
            //startActivity(intent)
            result.launch(intent)
        }

    }


}