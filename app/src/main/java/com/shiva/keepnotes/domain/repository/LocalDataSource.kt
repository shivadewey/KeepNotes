package com.shiva.keepnotes.domain.repository

import com.shiva.keepnotes.domain.model.RealtimeModelResponse
import com.shiva.keepnotes.domain.model.ResultState
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    fun insertNote(
        item: RealtimeModelResponse.RealtimeItems
    ): Flow<ResultState<String>>

    fun getAllNote(): Flow<ResultState<List<RealtimeModelResponse>>>

    fun getNote(key: String): Flow<ResultState<RealtimeModelResponse>>

    fun deleteNote(
        key: String
    ): Flow<ResultState<String>>

    fun updateNote(
        res: RealtimeModelResponse
    ): Flow<ResultState<String>>

}