package com.yakisan.ricked.presentation.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.yakisan.ricked.R
import com.yakisan.ricked.config.navigation.Screen
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController) {

    // * Splash to Main Screen
    LaunchedEffect(true) {
        delay(1000) //1s delay
        navController.navigate(Screen.MainScreen.route)
    }

    // * Ricked Logo
    Box(modifier = Modifier.fillMaxSize()) {
        Icon(
            modifier = Modifier
                .fillMaxSize()
                .align(alignment = Alignment.Center),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Ricked Logo"
        )

        // * 2024 © Ricked
        Text(
            text = stringResource(R.string.copyright),
            color = Color.Gray,
            modifier = Modifier
                .padding(all = 10.dp)
                .align(alignment = Alignment.BottomCenter)
        )
    }

}
