package com.notify

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ReminderDAO {
    @Query("SELECT * FROM reminders")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Query("DELETE FROM reminders")
    fun deleteAllReminders()
}
