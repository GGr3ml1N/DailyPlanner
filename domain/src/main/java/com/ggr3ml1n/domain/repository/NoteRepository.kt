package com.ggr3ml1n.domain.repository

import com.ggr3ml1n.domain.models.Note

interface NoteRepository {
    fun getNotes() : List<Note>
    suspend fun insertNote(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun deleteNote(id: Int)
}