package com.example.Logkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var a : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = 2

        if( a==2){
            Log.d("if문", "ENTER")

        }
        else if (a==1){
            Log.d("else if문", "ENTER")

        }

    }
}