package org.techtown.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import org.techtown.calculator.dao.HistoryDao
import org.techtown.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao

}