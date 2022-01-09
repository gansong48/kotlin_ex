package org.techtown.calculator.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import org.techtown.calculator.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * From history")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

}