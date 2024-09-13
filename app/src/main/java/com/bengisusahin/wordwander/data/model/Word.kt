package com.bengisusahin.wordwander.data.model

data class Word (
    val id: Int,
    val word: String,
    val translations: List<Translation>,
    val imageResId: Int? = null,
    var isLearned: Boolean = false
)