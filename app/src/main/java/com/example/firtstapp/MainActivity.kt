package com.example.firtstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson();
        val intent = Intent(this,Infomation::class.java);

        val login : Button = findViewById(R.id.login);
        val name : EditText = findViewById(R.id.name);
        val email: EditText = findViewById(R.id.email);
        val phone : EditText =findViewById(R.id.phone);

        login.setOnClickListener {
            intent.putExtra("name" , name.text.toString())
            intent.putExtra("email",email.text.toString())
            intent.putExtra("phone", phone.text.toString())
            startActivity(intent);
        }
    }



}