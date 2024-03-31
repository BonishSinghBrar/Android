package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val button = findViewById<MaterialButton>(R.id.button)

        button.setOnClickListener {
            displayTextView.visibility = TextView.VISIBLE
        }
    }
}
