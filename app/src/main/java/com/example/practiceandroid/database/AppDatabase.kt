package com.example.practiceandroid.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.practiceandroid.infra.word.WordDAO
import com.example.practiceandroid.infra.word.WordEntity

@Database(
    entities = arrayOf(WordEntity::class),
    version = 1,
    exportSchema = false
)
public abstract class AppDatabase : RoomDatabase() {
    abstract fun wordDAO(): WordDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java
                "word_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}