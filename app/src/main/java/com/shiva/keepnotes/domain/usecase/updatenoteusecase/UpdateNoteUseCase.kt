package com.shiva.keepnotes.domain.usecase.updatenoteusecase

import com.shiva.keepnotes.data.repository.Repository
import com.shiva.keepnotes.domain.model.RealtimeModelResponse

class UpdateNoteUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(items: RealtimeModelResponse) = repository.updateNote(items)
}