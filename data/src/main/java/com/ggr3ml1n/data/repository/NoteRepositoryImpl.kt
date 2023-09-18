package com.ggr3ml1n.data.repository

import com.ggr3ml1n.data.storage.NoteData
import com.ggr3ml1n.data.storage.NoteStorage
import com.ggr3ml1n.domain.models.Note
import com.ggr3ml1n.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteStorage: NoteStorage) : NoteRepository {
    override fun getNotes(): List<Note> {
        val tempListOfNotes = arrayListOf<Note>()
        noteStorage.getNotes().value?.forEach {
            tempListOfNotes.add(mapToDomain(it))
        }
        return tempListOfNotes
    }

    override suspend fun insertNote(note: Note) {
        noteStorage.insertNote(mapToData(note))
    }

    override suspend fun updateNote(note: Note) {
        noteStorage.updateNote(mapToData(note))
    }

    override suspend fun deleteNote(id: Int) {
        noteStorage.deleteNote(id)
    }

    private fun mapToData(note: Note): NoteData =
        NoteData(
            note.id,
            note.dataStart,
            note.dateFinish,
            note.name,
            note.description,
        )

    private fun mapToDomain(note: NoteData): Note = Note(
        note.id,
        note.dataStart,
        note.dateFinish,
        note.name,
        note.description
    )
}