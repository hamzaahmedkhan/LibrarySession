package com.example.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LibraryActivity : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = intent.getStringExtra("text")
        setContentView(R.layout.activity_library)

        textView = findViewById(R.id.textView)
        textView.text = text
    }
}