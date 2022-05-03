package com.kokhou.dailynews.domain.usecase

import com.kokhou.dailynews.data.model.APIResponse
import com.kokhou.dailynews.data.util.Resource
import com.kokhou.dailynews.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, searchQuery: String, page: Int): Resource<APIResponse> {
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }
}