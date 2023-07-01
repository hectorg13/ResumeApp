package com.example.hectorresume

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hectorresume.ui.Routes.Pantalla1
import com.example.hectorresume.ui.Routes.Pantalla2
import com.example.hectorresume.ui.Routes.Pantalla3
import com.example.hectorresume.ui.Screen1
import com.example.hectorresume.ui.Screen2
import com.example.hectorresume.ui.Screen3
import com.example.hectorresume.ui.theme.HectorResumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HectorResumeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Pantalla1.route
                    ) {
                        composable(Pantalla1.route) { Screen1(navigationController) }
                        composable(Pantalla2.route) { Screen2(navigationController) }
                        composable(Pantalla3.route) { Screen3(navigationController) }
                    }
                }
            }
        }
    }
}

