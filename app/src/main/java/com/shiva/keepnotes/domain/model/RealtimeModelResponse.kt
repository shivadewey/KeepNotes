package com.shiva.keepnotes.domain.model

data class RealtimeModelResponse(
    val item: RealtimeItems?,
    val key: String? = ""
) {
    data class RealtimeItems(
        val userId: String? = "",
        val title: String? = "",
        val note: String? = "",
        val createdAt: Long? = System.currentTimeMillis(),
        var updatedAt: Long? = System.currentTimeMillis(),
    )
}
