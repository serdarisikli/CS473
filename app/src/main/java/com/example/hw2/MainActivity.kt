package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var foods : ArrayList<String> = arrayListOf("Hamburger","Pizza","Mexican","American", "Chinese")
    lateinit var et : EditText
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var addFoodBt : Button = findViewById(R.id.addFoodBT)
        var decideBt : Button = findViewById(R.id.decideBT)

        addFoodBt.setOnClickListener { addFood() }
        decideBt.setOnClickListener { decide() }

        et = findViewById(R.id.newFoodET)
        tv = findViewById(R.id.foodTV)
    }

    fun addFood(){
        if(!et.text.isEmpty() && !foods.contains(et.text.toString()) ){
            foods.add(et.text.toString())
            et.setText("")

        }
    }
    fun decide() {
        tv.text = foods.random()
    }

}