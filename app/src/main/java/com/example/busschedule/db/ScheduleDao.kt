package com.example.busschedule.db

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {
    @Query("Select * from schedule order by arrival_time asc")
    fun getAll(): Flow<List<Schedule>>
    @Query("Select * from schedule where stop_name =:stopName")
    fun getByStopName(stopName:String):Flow<List<Schedule>>
}