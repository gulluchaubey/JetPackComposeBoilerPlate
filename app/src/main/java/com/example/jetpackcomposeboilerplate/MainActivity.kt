package com.example.jetpackcomposeboilerplate

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeboilerplate.navigation.HomeNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowText()
        }
    }
}

@Composable
fun ShowText() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Compose Basics",
            fontFamily = FontFamily.Cursive,
            fontSize = 32.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.clickable {
                Toast.makeText(
                    context,
                    "this is demo text",
                    Toast.LENGTH_LONG
                ).show()
            }
        )
        RowColumn(
            "Divya Chaubey",
            "Android Developer"
        )
        UserCard()
    }
}

@Composable
fun RowColumn(name: String, occupation: String) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(5.dp).clickable {
                val intent = Intent(context, HomeNavigation::class.java)
                context.startActivity(intent)
            },
        backgroundColor = Color.LightGray,
        elevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Column(
                modifier = Modifier.padding(5.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                UserDetail(name)
                UserDetail(occupation)
            }
        }
    }
}

@Composable
private fun UserCard(
    names: List<String> = List(100) { "$it" },
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(2.dp)
    ) {
        items(items = names) { name ->
            RowColumn(
                "$name David Elmore",
                "Software Developer"
            )
        }
    }
}

@Composable
fun UserDetail(name: String) {
    Text(
        text = name,
        fontSize = 25.sp,
        fontFamily = FontFamily.Cursive,
        color = Color.Black
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(Modifier.fillMaxSize()) {
        ShowText()
    }
}
