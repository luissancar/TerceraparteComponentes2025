package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        elevation = CardDefaults.cardElevation(50.dp),
        shape = RoundedCornerShape(40.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE3F2FD), // Fondo de la tarjeta
            contentColor = Color(0xFF1E88E5), // Color del contenido (texto, íconos)
            disabledContainerColor = Color(0xFFB0BEC5), // Fondo cuando está deshabilitada
            disabledContentColor = Color(0xFF90A4AE) // Color del contenido deshabilitado
        ),
        border = BorderStroke(2.dp, Color.Red)
    ) {
        Column(Modifier.padding(20.dp)) {
            Text("Texto A")
            Text("Texto B")
            Text("Texto C")
        }
    }
}