package com.yakisan.ricked

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.compose.RickedTheme
import com.yakisan.ricked.config.navigation.Navigation
import com.yakisan.ricked.core.di.networkModule
import com.yakisan.ricked.core.di.remoteDataSourceModule
import com.yakisan.ricked.core.di.repositoryModule
import com.yakisan.ricked.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // * Init koin
        startKoin {
            androidContext(this@MainActivity)
            modules(networkModule, repositoryModule, viewModelModule, remoteDataSourceModule)
        }

        setContent {
            RickedTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation() //Navigation
                }
            }
        }
    }
}