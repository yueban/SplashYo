package com.yueban.splashyo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.yueban.splashyo.data.model.UnSplashKeys

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", UnSplashKeys.getInstance(this).toString())
    }
}
