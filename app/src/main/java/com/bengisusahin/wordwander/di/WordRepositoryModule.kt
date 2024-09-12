package com.bengisusahin.wordwander.di

import com.bengisusahin.wordwander.data.datasource.WordDataSource
import com.bengisusahin.wordwander.data.repository.WordRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WordRepositoryModule {

    @Provides
    @Singleton
    fun provideWordRepository(
        wordDataSource: WordDataSource
    ): WordRepository {
        return WordRepository(wordDataSource)
    }
}