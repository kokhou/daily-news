package com.kokhou.dailynews.domain.usecase

import com.kokhou.dailynews.data.model.Article
import com.kokhou.dailynews.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}