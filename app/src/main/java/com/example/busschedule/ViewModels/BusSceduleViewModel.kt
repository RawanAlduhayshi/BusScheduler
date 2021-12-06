package com.example.busschedule.ViewModels

import androidx.lifecycle.ViewModel
import com.example.busschedule.db.Schedule
import com.example.busschedule.db.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusSceduleViewModel(private val  scheduleDao: ScheduleDao): ViewModel() {
    fun fullSchedule(): Flow<List<Schedule>>{
        return scheduleDao.getAll()
    }
    fun  scheduleForStopName(stopName:String) : Flow<List<Schedule>> = scheduleDao.getByStopName(stopName)


}
