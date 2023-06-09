package com.example.keyboardcontrollexam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.keyboardcontrollexam.KeyboardController.downKeyboard
import com.example.keyboardcontrollexam.KeyboardController.upKeyboard

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et: EditText = findViewById(R.id.editText)
        val up: Button = findViewById(R.id.upBtn)
        val down: Button = findViewById(R.id.downBtn)

        up.setOnClickListener {
            upKeyboard(this, et)
        }

        down.setOnClickListener {
            downKeyboard(this, et)
        }
    }
}