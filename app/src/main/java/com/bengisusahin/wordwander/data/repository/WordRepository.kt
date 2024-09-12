package com.bengisusahin.wordwander.data.repository

import com.bengisusahin.wordwander.data.datasource.WordDataSource
import com.bengisusahin.wordwander.data.model.Word
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordRepository @Inject constructor(
    private val wordDataSource: WordDataSource
) {

    private val allWords: List<Word> by lazy { wordDataSource.getWords() }

    fun getAllWords(): List<Word> = allWords

    fun getLearnedWords(): List<Word> = allWords.filter { it.isLearned }

    fun getUnlearnedWords(): List<Word> = allWords.filter { !it.isLearned }

}