package com.example.jetpackcomposeboilerplate.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcomposeboilerplate.navigation.navhost.ProfileNavigationHost

class ProfileNavigation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileNavigationHost()
        }
    }
}
