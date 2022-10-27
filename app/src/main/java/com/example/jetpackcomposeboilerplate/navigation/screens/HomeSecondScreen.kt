package com.example.jetpackcomposeboilerplate.navigation.screens

import android.content.Intent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.jetpackcomposeboilerplate.navigation.HomeNavigation
import com.example.jetpackcomposeboilerplate.navigation.ProfileNavigation

@Composable
fun HomeSecondScreen(context: HomeNavigation) {
    Button(onClick = {
        val intent = Intent(context, ProfileNavigation::class.java)
        context.startActivity(intent)
    }) {
        Text(text = "This is HomeSecondScreen. go to profile screen")
    }
}
