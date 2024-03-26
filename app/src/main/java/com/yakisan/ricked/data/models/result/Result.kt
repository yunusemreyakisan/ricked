package com.yakisan.ricked.data.models.result

import com.yakisan.ricked.data.models.character.Character

data class Result(
    val info: Info,
    val results: List<Character>
)