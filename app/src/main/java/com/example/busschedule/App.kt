package com.example.busschedule

import android.app.Application
import com.example.busschedule.db.AppDatabase

class App:Application() {


   val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }



    override fun onCreate() {
        val database: AppDatabase by lazy {
            super.onCreate()
            AppDatabase.getDatabase(this)

        }
    }
}


