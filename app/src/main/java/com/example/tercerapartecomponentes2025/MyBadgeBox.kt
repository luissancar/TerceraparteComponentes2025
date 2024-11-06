package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun MyBadgeBox() {


    var contador by rememberSaveable { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(1)
            if (contador++ >1000)
                contador=0
        }
    }

    //poner un padding si no se ve correctamente
    BadgedBox(badge = {
        Badge(
            containerColor = Color.Yellow, // Cambiamos el fondo del badge a amarillo
            contentColor = Color.Red
        ) {
            Text(contador.toString()) // Contenido del badge


        }
    }) {
        Icon(imageVector = Icons.Default.Add,
            contentDescription = "")
    }
}