package com.example.a4_calculatorapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var num1 by remember {
                mutableStateOf("")
            }
            var num2 by remember {
                mutableStateOf("")
            }
            var result by remember {
                mutableStateOf("")
            }
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)){
                TextField(value = num1, onValueChange = {
                    num1= it
                })
                Spacer(modifier = Modifier.height(17.dp))
                TextField(value = num2, onValueChange = {
                    num2 = it
                })
                Spacer(modifier = Modifier.height(17.dp))
                Row {
                    Button(onClick =  {
                         val sum = num1.toInt() + num2.toInt()
                        result = sum.toString()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Add")
                    }
                    Spacer(modifier = Modifier.width(17.dp))
                    Button(onClick =  {
                         val Sub = num1.toInt() - num2.toInt()
                        result = Sub.toString()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Sub")
                    }
                    Spacer(modifier = Modifier.width(17.dp))
                    Button(onClick =  {
                         val Mul = num1.toInt() * num2.toInt()
                        result = Mul.toString()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Mul")
                    }
                    Spacer(modifier = Modifier.width(17.dp))
                    Button(onClick =  {
                         val Div = num1.toInt() / num2.toInt()
                        result = Div.toString()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Div")
                    }

            }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Result is =  $result")
            }

        }
    }

    private fun Text(text: Int) {

    }
}

