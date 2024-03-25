package com.yakisan.ricked.config.navigation

sealed class Screen(val route: String) {
    data object SplashScreen : Screen("splash_screen") //Splash Screen
    data object HomeScreen : Screen("home_screen") //Home Screen
    //Other Screens
}