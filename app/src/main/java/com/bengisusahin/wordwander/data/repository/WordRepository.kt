package com.bengisusahin.wordwander.data.repository

import com.bengisusahin.wordwander.data.datasource.WordDataSource
import com.bengisusahin.wordwander.data.model.Word
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordRepository @Inject constructor(
    private val wordDataSource: WordDataSource
) {
    fun getAllWords(): List<Word> {
        return wordDataSource.getWords()
    }

    fun getLearnedWords(): List<Word> {
        return wordDataSource.getWords().filter { it.isLearned }
    }

    fun getUnlearnedWords(): List<Word> {
        return wordDataSource.getWords().filter { !it.isLearned }
    }

}