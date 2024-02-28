package com.example.testlayout.di

import android.content.Context
import androidx.room.Room
import com.example.testlayout.App
import com.example.testlayout.presentation.Rescord
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Provides
    @Singleton
    fun GetContext(@ApplicationContext context: Context):Context{
        return  context
    }
}