package com.yakisan.ricked.config.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yakisan.ricked.presentation.HomeScreen
import com.yakisan.ricked.presentation.SplashScreen

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

        // * Home Screen
        composable(route = Screen.HomeScreen.route,
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            })
        {
            HomeScreen(navController)
        }


    }
}