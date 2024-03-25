package com.yakisan.ricked.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yakisan.ricked.R


@Composable
fun SplashScreen(navController: NavController?) {
    // * Ricked Logo
    Box(modifier = Modifier.fillMaxSize()) {
        Icon(
            modifier = Modifier
                .fillMaxSize()
                .align(alignment = Alignment.Center),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Ricked Logo"
        )

        Text(
            text = "2024 Ricked.",
            modifier = Modifier
                .padding(all = 10.dp)
                .align(alignment = Alignment.BottomCenter)
        )

    }


}


@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    SplashScreen(navController = null)
}