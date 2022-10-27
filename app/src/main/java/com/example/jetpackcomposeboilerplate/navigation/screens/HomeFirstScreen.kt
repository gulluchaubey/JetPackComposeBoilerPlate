package com.example.jetpackcomposeboilerplate.navigation.screens

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.jetpackcomposeboilerplate.navigation.util.NavigationScreen

@Composable
fun HomeFirstScreen(navHostController: NavHostController) {
    Button(onClick = {
        navHostController.navigate(NavigationScreen.HomeSecondScreen.route)
    }) {
        Text(text = "This is HomeFirstScreen.Go to HomeSecondScreen")
    }
}
