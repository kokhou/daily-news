package com.kokhou.dailynews.domain.repository

import com.kokhou.dailynews.data.model.APIResponse
import com.kokhou.dailynews.data.model.Article
import com.kokhou.dailynews.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface
NewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Resource<APIResponse>

    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>


}