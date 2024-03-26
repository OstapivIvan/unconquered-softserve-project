package com.notify

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsersDAO {
    @Query("SELECT * FROM users")
    fun getAllUsers(): List<User>

    @Insert
    fun insertUser(user: User)
}
