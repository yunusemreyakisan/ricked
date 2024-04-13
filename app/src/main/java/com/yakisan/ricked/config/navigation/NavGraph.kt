package com.yakisan.ricked.config.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yakisan.ricked.presentation.MainScreen
import com.yakisan.ricked.presentation.pages.FavouriteScreen
import com.yakisan.ricked.presentation.pages.HomeScreen
import com.yakisan.ricked.presentation.pages.ProfileScreen
import com.yakisan.ricked.presentation.pages.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController() //NavController Value
    //Host
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    )
    {
        // * Splash Screen
        composable(route = Screen.SplashScreen.route)
        {
            SplashScreen(navController)
        }

        // * Main Screen
        composable(route = Screen.MainScreen.route)
        {
            MainScreen()
        }

    }
}

@Composable
fun BottomNavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Destinations.HomeScreen.route) {
        composable(Destinations.HomeScreen.route) {
            HomeScreen()
        }
        composable(Destinations.Favourite.route) {
            FavouriteScreen()
        }
        composable(Destinations.Profile.route) {
            ProfileScreen()
        }
    }
}