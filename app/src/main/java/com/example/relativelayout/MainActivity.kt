package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnMinus : Button
    lateinit var btnStar : Button
    lateinit var btnPlus : Button
    lateinit var btnDivide : Button
    lateinit var tvNumber : TextView
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMinus = findViewById(R.id.btnMinus)
        btnStar = findViewById(R.id.btnStar)
        btnPlus = findViewById(R.id.btnPlus)
        btnDivide = findViewById(R.id.btnDivide)
        tvNumber = findViewById(R.id.tvNumber)

        tvNumber.text = number.toString()
        btnMinus.setOnClickListener {
            number -= 2
            tvNumber.text = number.toString()
        }
        btnStar.setOnClickListener {
            number *= 2
            tvNumber.text = number.toString()
        }
        btnPlus.setOnClickListener {
            number +=2
            tvNumber.text = number.toString()
        }
        btnDivide.setOnClickListener {
            number /= 2
            tvNumber.text = number.toString()
        }

    }
}