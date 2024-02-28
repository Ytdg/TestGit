package com.example.testlayout.domain

import android.net.Uri
import androidx.compose.ui.graphics.Color
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.UUID

@Entity
data class PersonFighter(
    val text: String?,
    val color:Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
) {
}
