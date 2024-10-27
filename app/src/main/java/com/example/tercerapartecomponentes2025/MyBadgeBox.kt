package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyBadgeBox() {
    //poner un padding si no se ve correctamente
    BadgedBox(badge = {
        Badge(
            containerColor = Color.Yellow, // Cambiamos el fondo del badge a amarillo
            contentColor = Color.Red
        ) {
            Text("5") // Contenido del badge
        }
    }) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "")
    }
}