package com.bengisusahin.wordwander.data.model

data class Word (
    val id: Int,
    val word: String,
    val translations: List<Translation>,
    var isLearned: Boolean = false
)