package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAlertDialog01() {
    // son vistas declarativas, lo mostraremos dependiendo de un mutable state

    var openDialog by remember { mutableStateOf(false) }
Text("Hola")
    if (openDialog) {
        BasicAlertDialog(
            onDismissRequest = { openDialog = false },
            content = {
                Column {
                    Text("Este es un mensaje básico en el diálogo.")
                    Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el texto y los botones
                    Row {
                        TextButton(onClick = { openDialog = false }) {
                            Text("Aceptar")
                        }
                        TextButton(onClick = { openDialog = false }) {
                            Text("Cancelar")
                        }
                    }
                }
            },
            properties = DialogProperties(
                usePlatformDefaultWidth = false // Cambiar el ancho según tus necesidades
            ),
            modifier = Modifier.padding(16.dp) // Espaciado alrededor del diálogo
        )
    }
}
