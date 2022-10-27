package com.example.jetpackcomposeboilerplate.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcomposeboilerplate.navigation.navhost.HomeNavigationHost

class HomeNavigation : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeNavigationHost(this)
        }
    }
}
