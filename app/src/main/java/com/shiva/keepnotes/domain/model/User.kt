package com.shiva.keepnotes.domain.model

data class User(
    var userId: String = "",
    var profilrUrl: String = "",
    val email: String = "",
    val fullName: String = "",
)
