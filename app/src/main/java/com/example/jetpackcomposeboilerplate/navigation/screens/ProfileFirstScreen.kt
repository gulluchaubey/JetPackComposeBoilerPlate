package com.example.jetpackcomposeboilerplate.navigation.screens

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.jetpackcomposeboilerplate.navigation.util.NavigationScreen

@Composable
fun ProfileFirstScreen(navHostController: NavHostController) {
    Button(onClick = {
        navHostController.navigate(NavigationScreen.ProfileSecondScreen.route)
    }) {
        Text(text = "go to profile second screen")
    }
}
