package com.example.composecompoundviewsample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
            Greeting("World")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActivityMain()
}