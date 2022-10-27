package com.example.jetpackcomposeboilerplate.navigation.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ProfileSecondScreen(navController: NavHostController) {
    Button(onClick = {
        navController.popBackStack()
    }) {
        Text(text = "We are in second profile screen")
    }
}
