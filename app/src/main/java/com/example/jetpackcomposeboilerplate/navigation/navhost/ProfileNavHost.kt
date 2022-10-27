package com.example.jetpackcomposeboilerplate.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeboilerplate.navigation.screens.ProfileFirstScreen
import com.example.jetpackcomposeboilerplate.navigation.screens.ProfileSecondScreen
import com.example.jetpackcomposeboilerplate.navigation.util.NavigationScreen

@Composable
fun ProfileNavigationHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationScreen.ProfileFirstScreen.route) {
        composable(NavigationScreen.ProfileFirstScreen.route) {
            ProfileFirstScreen(navController)
        }
        composable(NavigationScreen.ProfileSecondScreen.route) {
            ProfileSecondScreen(navController)
        }
    }
}
