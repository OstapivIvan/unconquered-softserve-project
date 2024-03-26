package com.notify

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CategoriesDAO {
    @Query("SELECT * FROM users")
    fun getAllCategories(): List<User>

    @Insert
    fun insertCategory(category: User)
}
