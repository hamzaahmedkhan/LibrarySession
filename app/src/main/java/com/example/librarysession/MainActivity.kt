package com.example.librarysession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testlibrary.LibraryManager

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)

        button1.setOnClickListener {
            LibraryManager.openLibraryScreen(this, "This is text from Main Activity")
        }
    }
}