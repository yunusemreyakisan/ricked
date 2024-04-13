package com.yakisan.ricked.data.services

import com.yakisan.ricked.data.models.character.Character
import com.yakisan.ricked.data.models.result.Result
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    // * Getting single character
    @GET("character/{characterId}")
    suspend fun getCharacter(@Path("characterId") id: Int): Character

    // * Getting all characters
    @GET("character")
    suspend fun getAllCharacters(): Result

}