package com.shiva.keepnotes.domain.usecase.getnoteusecase

import com.shiva.keepnotes.data.repository.Repository

class GetNoteUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(key: String) = repository.getNote(key)
}