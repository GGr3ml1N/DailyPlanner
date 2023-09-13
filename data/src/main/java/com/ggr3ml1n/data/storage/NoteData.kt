package com.ggr3ml1n.data.storage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "notes_table")
data class NoteData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "dataStart")
    val dataStart: Timestamp,

    @ColumnInfo(name = "dateFinish")
    val dateFinish: Timestamp,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "description")
    val description: String,
)
