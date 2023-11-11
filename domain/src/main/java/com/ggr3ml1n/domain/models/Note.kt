package com.ggr3ml1n.domain.models

import java.sql.Timestamp

data class Note(
    val id: Int,
    val dataStart: Timestamp,
    val dateFinish: Timestamp,
    val name: String,
    val description: String,
)
