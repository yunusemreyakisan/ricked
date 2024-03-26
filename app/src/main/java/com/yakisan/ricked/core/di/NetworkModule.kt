package com.yakisan.ricked.core.di

import com.yakisan.ricked.core.constants.Constant.BASE_URL
import com.yakisan.ricked.data.services.CharacterService
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// * HTTP Client
fun provideHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .build()
}

// * Retrofit
fun provideRetrofit(
    okHttpClient: OkHttpClient
): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

// * Character Service
fun provideCharacterService(retrofit: Retrofit): CharacterService =
    retrofit.create(CharacterService::class.java)


// * Includes network module.
val networkModule = module {
    single { provideHttpClient() }
    single { provideRetrofit(get()) }
    single { provideCharacterService(get()) }
}