package com.kokhou.dailynews.presentation.di

import com.kokhou.dailynews.data.repository.NewsRepositoryImpl
import com.kokhou.dailynews.data.repository.dataSource.NewsLocalDataSource
import com.kokhou.dailynews.data.repository.dataSource.NewsRemoteDataSource
import com.kokhou.dailynews.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














