package com.example.selection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.selection.ui.theme.SelectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.backgraund){
                    CustomText()
                }
            }
        }
    }
}

@Composable
fun CustomText(){
    Column {
        SelectionContainer {
            Text(text = "Hello world")
            DisableSelection {
                Text("Hello world")
            }
            Text(text = "Hello world")
        }
    }
}

