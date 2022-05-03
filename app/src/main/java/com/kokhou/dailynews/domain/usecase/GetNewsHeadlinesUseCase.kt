package com.kokhou.dailynews.domain.usecase

import com.kokhou.dailynews.data.model.APIResponse
import com.kokhou.dailynews.data.util.Resource
import com.kokhou.dailynews.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country, page)
    }
}