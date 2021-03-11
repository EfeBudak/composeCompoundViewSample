package com.example.composecompoundviewsample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecompoundviewsample.ui.ComposeCompoundViewSampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCompoundViewSampleTheme {
                // A surface container using the 'background' color from the theme
                ActivityMain()
            }
        }
    }
}

@Composable
fun ActivityMain() {
    ComposeCompoundViewSampleTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column {
                for (i in 0..2) {
                    Greeting("World")
                    Divider()
                }
                Greeting("Mars")
                Counter()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(16.dp))
}

@Composable
fun Counter(initialCount: Int = 0) {
    val count = remember { mutableStateOf(initialCount) }
    Button(onClick = { count.value++ }) {
        Text("I've been clicked ${count.value} times")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActivityMain()
}