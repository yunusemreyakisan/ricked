package com.yakisan.ricked.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.yakisan.ricked.core.util.Resource
import com.yakisan.ricked.presentation.viewmodels.CharacterViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(navController: NavController, viewModel: CharacterViewModel = koinViewModel()) {

    val character by viewModel.characterFlow.collectAsState(initial = Resource.Loading())
    val allCharacters by viewModel.allCharacterFlow.collectAsState(initial = Resource.Loading())

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        

    }
}