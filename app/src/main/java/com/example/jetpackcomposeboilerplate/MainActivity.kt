package com.example.jetpackcomposeboilerplate

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeboilerplate.ui.theme.JetPackComposeBoilerPlateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {
            JetPackComposeBoilerPlateTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("testing")
                            },
                            actions = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Create, contentDescription = "message")
                                }
                            },
                            backgroundColor = MaterialTheme.colors.primary
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { }) {
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Add, contentDescription = "add")
                            }
                        }
                    }
                ) {
                    Greeting(name = "gggggg")
                }
               *//* // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }*//*
            }
        }*/

        setContent {
            JetPackComposeBoilerPlateTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Demo App Yt")
                            },
                            navigationIcon = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Menu, contentDescription = "menu")
                                }
                            },
                            actions = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Notifications, contentDescription = "noti")
                                }
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Search, contentDescription = "search")
                                }
                            }
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Add, contentDescription = "add")
                            }
                        }
                    }
                    // floatingActionButtonPosition = FabPosition.End
                ) {
                    // ShowSwitch()
                    Greeting(name = "testing")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, ) {
    Text(
        text = "Hello $name!",
        color = Color(R.color.black),
        modifier = Modifier.size(60.dp)
    )
}

@Preview(showBackground = true, name = "light mode")
@Preview(
    showBackground = true,
    name = "dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DefaultPreview() {
    JetPackComposeBoilerPlateTheme {
        // Greeting("Android")
        //Greeting(name = "testing")
    }
}
