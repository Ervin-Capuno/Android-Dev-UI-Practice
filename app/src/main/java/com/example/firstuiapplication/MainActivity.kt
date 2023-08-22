package com.example.firstuiapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.firstuiapplication.ui.theme.FirstUIApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstUIApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier=Modifier.fillMaxSize(),
            verticalArrangement=Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "Hello $name!",
                style= TextStyle(
                    color = Color.Black,
                    fontSize = 40.sp,
                    fontStyle= FontStyle.Italic,
                    letterSpacing=  0.2.em,
                    background=Color.Transparent,
                    textDecoration = TextDecoration.None,
                    fontFamily = FontFamily.Serif
                )
        )
        Text(
            text = "Bakit",
            style=TextStyle(
                fontSize=31.sp,
                fontStyle=FontStyle.Italic,
                letterSpacing=0.3.em,
                background=Color.LightGray,
                textDecoration = TextDecoration.None,
                fontFamily=FontFamily.Cursive

            )
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstUIApplicationTheme {
        Greeting("Android")
    }
}