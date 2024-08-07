package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    // Creamos un estado para manejar el texto del botón
    var buttonText by remember { mutableStateOf("Presionar") }

    // Contenedor principal
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Textos
        Text(text = "Texto 1", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Texto 2", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Texto 3", style = MaterialTheme.typography.bodyLarge)

        // Botón
        Button(onClick = {
            // Acción al presionar el botón: cambia el texto del botón
            buttonText = "Botón Presionado"
        }) {
            Text(buttonText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
