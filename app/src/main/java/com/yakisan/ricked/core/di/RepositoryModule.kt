package com.yakisan.ricked.core.di

import com.yakisan.ricked.data.repositories.CharacterRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory { CharacterRepository(get()) }
}