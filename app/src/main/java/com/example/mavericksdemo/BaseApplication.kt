package com.example.mavericksdemo

import android.app.Application
import com.airbnb.mvrx.Mavericks

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}