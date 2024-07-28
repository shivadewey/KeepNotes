package com.shiva.keepnotes.domain.usecase.deletenoteusecase

import com.shiva.keepnotes.data.repository.Repository

class DeleteNoteUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(key:String) = repository.deleteNote(key)
}