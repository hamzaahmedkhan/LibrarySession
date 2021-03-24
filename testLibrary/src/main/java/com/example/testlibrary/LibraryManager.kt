package com.example.testlibrary

import android.app.Activity
import android.content.Intent

object LibraryManager {

    fun openLibraryScreen(activity: Activity) {
        activity.startActivity(Intent(activity, LibraryActivity::class.java))
    }
}