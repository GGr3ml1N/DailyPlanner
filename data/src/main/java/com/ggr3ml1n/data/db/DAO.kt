package com.ggr3ml1n.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface DAO {

    @Query("SELECT * FROM notes_table")
    fun getNotes(): Flow<List<com.ggr3ml1n.data.storage.NoteData>>

    @Query("DELETE FROM notes_table WHERE id is :id")
    suspend fun deleteNote(id: Int)

    @Insert
    suspend fun insertNote(note: com.ggr3ml1n.data.storage.NoteData)

    @Update
    suspend fun updateNote(note: com.ggr3ml1n.data.storage.NoteData)
}