package com.shiva.keepnotes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shiva.keepnotes.data.local.dao.NoteDao
import com.shiva.keepnotes.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}