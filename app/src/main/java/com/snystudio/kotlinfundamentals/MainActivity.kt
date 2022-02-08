package com.snystudio.kotlinfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage=findViewById(R.id.text_cube)
        val rollButton: Button = findViewById(R.id.btnId)
        rollButton.setOnClickListener { rollDice()}
    }

    private fun rollDice(){
        val randInt=(1..6).random()
        val drawableResource = when(randInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}