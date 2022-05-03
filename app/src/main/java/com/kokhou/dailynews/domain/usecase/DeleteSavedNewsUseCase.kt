package com.kokhou.dailynews.domain.usecase

import com.kokhou.dailynews.data.model.Article
import com.kokhou.dailynews.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}