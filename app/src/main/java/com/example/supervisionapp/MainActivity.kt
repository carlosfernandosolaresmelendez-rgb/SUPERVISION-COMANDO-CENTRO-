
package com.example.supervisionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SupervisionApp()
        }
    }
}

@Composable
fun SupervisionApp() {
    Scaffold {
        Surface(color = MaterialTheme.colors.background) {
            Text("Bienvenido a SupervisionApp (Debug APK)")
        }
    }
}
