package com.bengisusahin.wordwander.data.model

import java.io.Serializable

data class Translation(
    val language: String,
    val translatedWord: String
): Serializable
