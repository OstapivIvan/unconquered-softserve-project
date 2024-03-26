package com.notify

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "reminders")
data class Reminder(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var dateTime: Date,
    var repeatIn: Date?,
    var title: String,
    var notificationType: String?,
    var notificationNotes: String?,
    var place: String
)
