package com.yakisan.ricked.config.navigation

sealed class Screen(val route: String) {
    data object SplashScreen : Screen("splash_screen") //Splash Screen
    data object MainScreen : Screen("home_screen") //Main Screen

    //Other Screens
}