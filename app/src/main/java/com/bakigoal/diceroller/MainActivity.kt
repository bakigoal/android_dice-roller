package com.bakigoal.diceroller

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("main", "on create")

        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        rollDice()
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val diceImage = findViewById<ImageView>(R.id.dice_image)
        diceImage.setImageResource(getDiceImage(randomInt))
    }

    private fun getDiceImage(i: Int): Int = when (i) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    override fun onStart() {
        super.onStart()
        Log.i("main", "on start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("main", "on resume")
    }

    /**
     * Foreground lifetime:
     * onResume -> onPause
     */
    override fun onPause() {
        super.onPause()
        Log.i("main", "on pause")
    }

    /**
     * Visible lifetime:
     * onStart -> onResume -> onPause -> onStop
     */
    override fun onStop() {
        super.onStop()
        Log.i("main", "on stop")
    }

    /**
     * Entire lifetime:
     * onCreate -> onStart -> onResume -> onPause -> onStop -> onDestroy
     */
    override fun onDestroy() {
        super.onDestroy()
        Log.i("main", "on destroy")
    }
}