package com.yakisan.ricked.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yakisan.ricked.core.util.Resource
import com.yakisan.ricked.data.models.character.Character
import com.yakisan.ricked.data.models.result.Result
import com.yakisan.ricked.data.repositories.CharacterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharacterViewModel(private val repository: CharacterRepository) : ViewModel() {
    private val _characterFlow = MutableStateFlow<Resource<Character>>(Resource.Loading())
    val characterFlow: StateFlow<Resource<Character>> = _characterFlow

    private val _allCharacterFlow = MutableStateFlow<Resource<Result>>(Resource.Loading())
    val allCharacterFlow: StateFlow<Resource<Result>> = _allCharacterFlow

    init {
        getAllCharacters()
    }


    fun getCharacter(id: Int) {
        viewModelScope.launch {
            repository.getCharacter(id).collect {
                _characterFlow.value = it
            }
        }
    }

    private fun getAllCharacters() {
        viewModelScope.launch {
            repository.getAllCharacters().collect {
                _allCharacterFlow.value = it
            }
        }
    }
}