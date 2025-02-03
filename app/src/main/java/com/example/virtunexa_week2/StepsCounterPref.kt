package com.example.virtunexa_week2

import android.content.Context
import android.content.SharedPreferences

object StepCounterPref {
    private const val SHARED_PREFS_FILE = "StepCounterPrefs"
    private const val STEP_COUNT_KEY = "StepCountKey"
    private lateinit var prefs: SharedPreferences

    fun initialize(context: Context) {
        prefs = context.getSharedPreferences(SHARED_PREFS_FILE, Context.MODE_PRIVATE)
    }

    var stepCount: Int
        get() = prefs.getInt(STEP_COUNT_KEY, 0)
        set(value) = prefs.edit().putInt(STEP_COUNT_KEY, value).apply()
}