package com.example.testlibrary

import android.app.Activity
import android.content.Intent

object LibraryManager {

    fun openLibraryScreen(activity: Activity, text: String = "default") {
        val intent = Intent(activity, LibraryActivity::class.java)
        intent.putExtra("text", text)
        activity.startActivity(intent)
    }
}