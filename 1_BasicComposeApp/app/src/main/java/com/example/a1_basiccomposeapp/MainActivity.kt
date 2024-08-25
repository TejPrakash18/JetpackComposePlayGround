package com.example.a1_basiccomposeapp

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a1_basiccomposeapp.ui.theme._1_BasicComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val applicationContext = applicationContext
            _1_BasicComposeAppTheme {
                Greeting(applicationContext = applicationContext)
            }
        }
    }
}

@Composable
fun Greeting(applicationContext : Context?) {
    Column {
        Text(text = "Hello World!")
        Text(text = "Good Morning")
        Button(onClick = {
            Toast.makeText(applicationContext,"Button is working",Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _1_BasicComposeAppTheme {
        Greeting(applicationContext = null)
    }
}