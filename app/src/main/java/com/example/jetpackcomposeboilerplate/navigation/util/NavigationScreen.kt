package com.example.jetpackcomposeboilerplate.navigation.util

sealed class NavigationScreen(val route: String) {
    object HomeFirstScreen : NavigationScreen("homefirstscreen")
    object HomeSecondScreen : NavigationScreen("homesecondscreen")
    object ProfileFirstScreen : NavigationScreen("profilefirstscreen")
    object ProfileSecondScreen : NavigationScreen("profilesecondscreen")
}
