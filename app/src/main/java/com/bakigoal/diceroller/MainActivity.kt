package com.bakigoal.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("main", "on create")
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