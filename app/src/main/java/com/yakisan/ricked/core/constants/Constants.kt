package com.yakisan.ricked.core.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.platform.LocalFocusManager

// * Includes const values & functions.
object Constant {
    const val BASE_URL = "https://rickandmortyapi.com/api/" // * Base URL for API
}

// * Getting screen focus manager
@Composable
fun getFocusManager(): FocusManager {
    return LocalFocusManager.current
}
