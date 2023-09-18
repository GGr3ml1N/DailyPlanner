package com.ggr3ml1n.data.storage

import androidx.lifecycle.LiveData

interface NoteStorage {
    fun getNotes() : LiveData<List<NoteData>>
    suspend fun insertNote(note: NoteData)
    suspend fun updateNote(note: NoteData)
    suspend fun deleteNote(id: Int)
}