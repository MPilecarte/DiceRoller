package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = viewBinding(R.id.RollButton)
        rollButton.setOnClickListener { rollDice() }
    }

    fun rollDice(){
        val randomInt = (1..6).random().toString()
        val resultText: TextView = findViewById(R.id.RandomNumber)
    }


}