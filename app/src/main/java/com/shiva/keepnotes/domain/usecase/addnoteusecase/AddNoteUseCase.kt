package com.shiva.keepnotes.domain.usecase.addnoteusecase

import com.shiva.keepnotes.data.repository.Repository
import com.shiva.keepnotes.domain.model.RealtimeModelResponse

class AddNoteUseCase(
    private val repository: Repository
) {
    operator fun invoke(item: RealtimeModelResponse.RealtimeItems) = repository.insertNote(item = item)
}