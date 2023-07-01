package com.example.hectorresume.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.hectorresume.ui.introducescreen.IntroduceMyScreen
import com.example.hectorresume.ui.jobscreen.JobsScreen

@Composable
fun Screen1(navController: NavHostController) {
    IntroduceMyScreen(navController)
}

@Composable
fun Screen2(navController: NavHostController) {
    JobsScreen(navController)
}

@Composable
fun Screen3(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(
            text = "Thirteen Screen",
            modifier = Modifier.clickable { navController.navigate("pantalla1") })
    }
}