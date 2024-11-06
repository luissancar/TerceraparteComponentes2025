package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAlertDialog01() {
    // son vistas declarativas, lo mostraremos dependiendo de un mutable state
    var openDialog by remember { mutableStateOf(true) }

    if (openDialog) {
        BasicAlertDialog(
            onDismissRequest = {
                // Descarta el diálogo cuando el usuario hace clic fuera del diálogo o en el botón de retroceso.
                // Si deseas desactivar esa funcionalidad, simplemente utiliza un onDismissRequest vacío
                openDialog = false
            },
        ) {
            Surface(  //Surface es un contenedor que proporciona un fondo con un color
                // y características de material design, como elevación y forma.
                modifier = Modifier.wrapContentWidth().wrapContentHeight(),
                shape = MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text =
                        "Surface es un contenedor que proporciona un fondo con un color y " +
                                "características de material design, como elevación y forma.",
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    TextButton(
                        onClick = { openDialog = false },
                        modifier = Modifier.
                        shadow(1.dp, shape = MaterialTheme.shapes.small) // Aplicar sombra
                    ) {
                        Text("Confirm")
                    }
                }
            }
        }
    }
}
