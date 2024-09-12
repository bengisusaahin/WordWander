package com.bengisusahin.wordwander.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bengisusahin.wordwander.data.model.Word
import com.bengisusahin.wordwander.data.repository.WordRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val wordRepository: WordRepository
) : ViewModel() {
    private val _words = MutableLiveData<List<Word>>()
    val words: LiveData<List<Word>> get() = _words

    private val _learnedWords = MutableLiveData<List<Word>>()
    val learnedWords: LiveData<List<Word>> get() = _learnedWords

    private val _unlearnedWords = MutableLiveData<List<Word>>()
    val unlearnedWords: LiveData<List<Word>> get() = _unlearnedWords

    init {
        getAllWords()
    }

    private fun getAllWords() {
        _words.value = wordRepository.getAllWords()
    }

    private fun getLearnedWords() {
        _learnedWords.value = wordRepository.getLearnedWords()
    }

    private fun getUnlearnedWords() {
        _unlearnedWords.value = wordRepository.getUnlearnedWords()
    }
}