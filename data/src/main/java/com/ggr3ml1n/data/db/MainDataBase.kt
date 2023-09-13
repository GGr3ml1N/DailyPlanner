package com.ggr3ml1n.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ggr3ml1n.data.storage.NoteData

@Database(entities = [NoteData::class], version = 1)
abstract class MainDataBase : RoomDatabase(){

    abstract fun getDao(): DAO
    companion object {
        @Volatile
        private var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context): MainDataBase {
            val dataBase = INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "daily_planner.db"
                ).build()
                instance
            }
            INSTANCE = dataBase
            return dataBase
        }
    }
}