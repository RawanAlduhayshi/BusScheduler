package com.example.busschedule.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.busschedule.db.ScheduleDao

class ViewModelFactory(private val dao:ScheduleDao):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BusSceduleViewModel::class.java)) {
           @Suppress("UNCHECKED Case")
            return BusSceduleViewModel(dao) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}