package com.kokhou.dailynews.domain.usecase

import com.kokhou.dailynews.data.model.Article
import com.kokhou.dailynews.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}