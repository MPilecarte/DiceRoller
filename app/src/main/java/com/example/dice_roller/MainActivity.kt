package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button =findViewById(R.id.RollButton)
        rollButton.setOnClickListener { rollDice() }
    }

    fun rollDice(){
        val resultText: TextView = findViewById(R.id.RollButton)

        val randomInt = (1..6).random().toString()

    }

}