package com.example.lesson5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tvMassage = findViewById<TextView>(R.id.tvMassage)
        val i = intent
        if (i != null) tvMassage.setText(i.getCharSequenceExtra("Salyut"))
    }
    fun onClickStart2(view: View)
    {
        val intent2 = Intent (this, MainActivity2::class.java)
        startActivity(intent2)
    }
    fun onClickStart3(view: View)
    {
        val intent3 = Intent (this, MainActivity3::class.java)
        startActivity(intent3)
    }
}