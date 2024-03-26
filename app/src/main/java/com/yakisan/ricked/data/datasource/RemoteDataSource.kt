package com.yakisan.ricked.data.datasource

import android.util.Log
import com.yakisan.ricked.core.util.Resource
import com.yakisan.ricked.data.models.character.Character
import com.yakisan.ricked.data.models.result.Result
import com.yakisan.ricked.data.services.CharacterService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RemoteDataSource(private val apiService: CharacterService) {

    // * Get single character
    suspend fun getCharacter(id: Int): Flow<Resource<Character>> = flow {
        emit(Resource.Loading())
        try {
            val character = apiService.getCharacter(id)
            emit(Resource.Success(character))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Something went wrong"))
        }
    }


    // * Get all characters
    suspend fun getAllCharacters(): Flow<Resource<Result>> = flow {
        emit(Resource.Loading())
        try {
            val list = apiService.getAllCharacters()
            Log.d("DATASOURCE", "DATASOURCE: VERİ ÇEKİLDİ ${list.results}")
            emit(Resource.Success(list))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Something went wrong"))
        }
    }
}