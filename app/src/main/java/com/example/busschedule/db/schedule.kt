package com.example.busschedule.db

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "schedule")
data class Schedule(@PrimaryKey var id:Int, @NonNull @ColumnInfo(name= "stop_name")
var stopName:String, @NonNull @ColumnInfo(name= "arrival_time")var arrivalTime:Int)
