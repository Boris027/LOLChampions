package com.turing.alan.cpifp.di

import com.turing.alan.cpifp.data.Logger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideLogger(): Logger {
        return Logger() // Proporciona una instancia de Logger
    }
}