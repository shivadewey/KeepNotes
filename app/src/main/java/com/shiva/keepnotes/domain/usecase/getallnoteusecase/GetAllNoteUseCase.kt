package com.shiva.keepnotes.domain.usecase.getallnoteusecase

import com.shiva.keepnotes.data.repository.Repository
import com.shiva.keepnotes.domain.model.RealtimeModelResponse
import com.shiva.keepnotes.domain.model.ResultState
import kotlinx.coroutines.flow.Flow


class GetAllNoteUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(): Flow<ResultState<List<RealtimeModelResponse>>> = repository.getAllNote()
}