package com.example.jetpackcomposeboilerplate.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeboilerplate.navigation.HomeNavigation
import com.example.jetpackcomposeboilerplate.navigation.screens.HomeFirstScreen
import com.example.jetpackcomposeboilerplate.navigation.screens.HomeSecondScreen
import com.example.jetpackcomposeboilerplate.navigation.util.NavigationScreen

@Composable
fun HomeNavigationHost(context: HomeNavigation) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationScreen.HomeFirstScreen.route) {
        composable(NavigationScreen.HomeFirstScreen.route) {
            HomeFirstScreen(navController)
        }
        composable(NavigationScreen.HomeSecondScreen.route) {
            HomeSecondScreen(context)
        }
    }
}
