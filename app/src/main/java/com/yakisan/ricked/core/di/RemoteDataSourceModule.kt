package com.yakisan.ricked.core.di

import com.yakisan.ricked.data.datasource.RemoteDataSource
import org.koin.dsl.module

val remoteDataSourceModule = module {
    single { RemoteDataSource(get()) }
}