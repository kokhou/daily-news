package com.kokhou.dailynews.presentation.di

import com.kokhou.dailynews.data.db.ArticleDAO
import com.kokhou.dailynews.data.repository.dataSource.NewsLocalDataSource
import com.kokhou.dailynews.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }

}













