package com.yakisan.ricked.data.repositories

import com.yakisan.ricked.core.util.Resource
import com.yakisan.ricked.data.datasource.RemoteDataSource
import com.yakisan.ricked.data.models.character.Character
import com.yakisan.ricked.data.models.result.Result
import kotlinx.coroutines.flow.Flow


class CharacterRepository(private val remoteDataSource: RemoteDataSource) {

    // * Get single character
    suspend fun getCharacter(id: Int): Flow<Resource<Character>> = remoteDataSource.getCharacter(id)

    // * Get all characters
    suspend fun getAllCharacters(): Flow<Resource<Result>> = remoteDataSource.getAllCharacters()

}