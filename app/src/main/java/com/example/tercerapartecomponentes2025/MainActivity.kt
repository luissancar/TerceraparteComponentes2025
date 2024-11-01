package com.example.tercerapartecomponentes2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tercerapartecomponentes2025.ui.theme.TerceraparteComponentes2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TerceraparteComponentes2025Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var show by rememberSaveable { mutableStateOf(false) }
    var enaButton by rememberSaveable { mutableStateOf(true) }
    Column(modifier = modifier.fillMaxSize()) {
        // MyCard()
        //MyBadgeBox()
        // MyDivider()
        //MyDropDownMenu()
        //MySlider()
        //MySlider02()
        //MyAlertDialog01()
        Button(onClick = {
            show = true
            enaButton = false
        }
        ) {
            Text(text = "Show")
        }
        MyCustonDialog(show) {
            show = false
            enaButton = true
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TerceraparteComponentes2025Theme {
        Greeting("Android")
    }
}