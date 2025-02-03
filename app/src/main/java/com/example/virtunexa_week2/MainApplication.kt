package com.example.virtunexa_week2

import android.app.Application

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        StepCounterPref.initialize(this)
    }

}