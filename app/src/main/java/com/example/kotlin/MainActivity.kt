package com.example.kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val noteOne = Note("Понедельник", "Заметка")
        val noteTwo = noteOne.copy()
        val textViewOne: TextView = findViewById(R.id.textViewOne)
        val textViewTwo: TextView = findViewById(R.id.textViewTwo)

        val button: Button = findViewById(R.id.button_test)
        button.setOnClickListener {
            textViewOne.text = noteOne.title + " " + noteOne.description
            textViewTwo.text = noteTwo.title + " " +  noteTwo.description
        }
    }
}