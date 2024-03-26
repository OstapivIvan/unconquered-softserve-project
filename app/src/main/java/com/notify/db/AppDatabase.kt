package com.notify

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [User::class], version = 1)
@TypeConverters(Converters::class)
abstract class MyAppDatabase : RoomDatabase() {
    abstract fun usersDAO(): UsersDAO
}
