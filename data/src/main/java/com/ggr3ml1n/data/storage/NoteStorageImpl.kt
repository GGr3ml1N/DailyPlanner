package com.ggr3ml1n.data.storage

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.ggr3ml1n.data.db.MainDataBase

class NoteStorageImpl(dataBase: MainDataBase) : NoteStorage {
    private val dao = dataBase.getDao()

    override fun getNotes(): LiveData<List<NoteData>> = dao.getNotes().asLiveData()

    override suspend fun insertNote(note: NoteData) {
        dao.insertNote(note)
    }

    override suspend fun updateNote(note: NoteData) {
        dao.updateNote(note)
    }

    override suspend fun deleteNote(id: Int) {
        dao.deleteNote(id)
    }
}