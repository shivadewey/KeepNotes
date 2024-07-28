package com.shiva.keepnotes.data.repository

import com.shiva.keepnotes.domain.model.RealtimeModelResponse
import com.shiva.keepnotes.domain.repository.LocalDataSource
import javax.inject.Inject

class Repository @Inject constructor(
    private val localDataSource: LocalDataSource
) {

    fun insertNote(item: RealtimeModelResponse.RealtimeItems) = localDataSource.insertNote(item)

    fun getAllNote() = localDataSource.getAllNote()
    fun getNote(key: String) = localDataSource.getNote(key)
    fun deleteNote(
        key: String
    ) = localDataSource.deleteNote(key = key)

    fun updateNote(
        res: RealtimeModelResponse
    ) = localDataSource.updateNote(res)

}