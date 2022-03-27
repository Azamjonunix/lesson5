package com.example.lesson5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    fun onClikStart3(view: View) { // buttonga on klik bervolamiz
        val intent3 = Intent(this, MainActivity::class.java)
        startActivity(intent3)
    }
}