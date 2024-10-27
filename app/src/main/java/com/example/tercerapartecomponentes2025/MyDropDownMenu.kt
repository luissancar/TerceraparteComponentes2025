package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyDropDownMenu() {
    var selectedOption by rememberSaveable { mutableStateOf("") }
    var expanded by rememberSaveable { mutableStateOf(false) }
    val options = listOf("Opción 1", "Opción 2", "Opción 3")

    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = selectedOption,
            onValueChange = { selectedOption = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth()
        )
        // Menú desplegable

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            }, // Cierra el menú cuando se hace clic fuera de él
            modifier = Modifier.fillMaxWidth()
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    onClick = {
                        selectedOption =
                            option // Actualiza el texto del botón con la opción seleccionada
                        expanded = false // Cierra el menú
                    },
                    text = { Text(option) } // Pasa el texto directamente al parámetro 'text'
                )
            }
        }

        if (selectedOption.isEmpty())
            Text("Ninguna")
        else
            Text(selectedOption)


    }

}