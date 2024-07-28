package com.shiva.keepnotes.domain.usecase

import com.shiva.keepnotes.domain.usecase.addnoteusecase.AddNoteUseCase
import com.shiva.keepnotes.domain.usecase.deletenoteusecase.DeleteNoteUseCase
import com.shiva.keepnotes.domain.usecase.getallnoteusecase.GetAllNoteUseCase
import com.shiva.keepnotes.domain.usecase.getnoteusecase.GetNoteUseCase
import com.shiva.keepnotes.domain.usecase.updatenoteusecase.UpdateNoteUseCase

data class UseCases(
    val addNoteUseCase: AddNoteUseCase,
    val getAllNoteUseCase: GetAllNoteUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val updateNoteUseCase: UpdateNoteUseCase
)
