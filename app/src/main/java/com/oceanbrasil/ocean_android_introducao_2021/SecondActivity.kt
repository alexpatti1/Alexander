package com.oceanbrasil.ocean_android_introducao_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txTopo = findViewById<TextView>(R.id.txTopo)

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        btVoltar .setOnClickListener {
            val voltarIntent = Intent(this,MainActivity::class.java)
            startActivity(voltarIntent)
        }
    }
}