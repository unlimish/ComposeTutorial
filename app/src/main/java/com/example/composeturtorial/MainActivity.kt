package com.example.composeturtorial

import android.os.Bundle
import android.support.v4.os.IResultReceiver
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeturtorial.ui.theme.ComposeTurtorialTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
private fun Greeting(name: String){
    Surface(color = MaterialTheme.colors.primary){
    Text(text = "Hello $name!",
    modifier = Modifier.padding(24.dp))
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting("Android")
    }
}