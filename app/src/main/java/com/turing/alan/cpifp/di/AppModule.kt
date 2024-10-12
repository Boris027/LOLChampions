package com.turing.alan.cpifp.di

import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideLogger(): InMemoryChampionsRepository {
        return InMemoryChampionsRepository() // Proporciona una instancia de Logger
    }
}