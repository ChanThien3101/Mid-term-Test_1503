package com.example.firtstapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import java.util.*

import kotlin.collections.ArrayList

class Infomation : AppCompatActivity() {

    lateinit var  countries : RecyclerView
    lateinit var adapterZ : RecycleViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);

        countries = findViewById(R.id.countries)
        adapterZ  = RecycleViewAdapter()

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        val nameText : TextView = findViewById(R.id.nameRecieve)
        val emailText : TextView = findViewById(R.id.emailRecieve)
        val phoneText : TextView = findViewById(R.id.phoneReceive)



        nameText.setText(name);
        emailText.setText(email);
        phoneText.setText(phone);

        addDataSet()
        initRecyclerView()
    }


    private fun addDataSet(){
        val cappicals : ArrayList<String> = ArrayList();
        cappicals.add("ĐÀ NẴng")
        cappicals.add("Tây Nguyên")
        cappicals.add("Hà Giang")
        adapterZ.submitList(cappicals)
    }

    private fun initRecyclerView(){

        countries.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterZ
        }
    }
}