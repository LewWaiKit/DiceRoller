package com.mad.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button_roll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
        val NumberTextView : TextView = findViewById(R.id.TextView_number)
        val random_number = (1..6).random()
        NumberTextView.text = random_number.toString()
    }
}