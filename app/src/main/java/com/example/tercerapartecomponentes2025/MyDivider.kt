package com.example.tercerapartecomponentes2025

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyDivider() {
    Column(Modifier.fillMaxWidth()) {
        Text(text = "Item 1", modifier = Modifier.padding(8.dp))

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho de la columna
            thickness = 1.dp, // Grosor de la línea
            color = Color.Gray // Color de la línea divisoria
        )

        Text(text = "Item 2", modifier = Modifier.padding(8.dp))

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 2.dp, // Grosor más grueso
            color = Color.Blue
        )

        Text(text = "Item 3", modifier = Modifier.padding(8.dp))

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 4.dp, // Aún más grueso
            color = Color.Red
        )

        Text(text = "Item 4", modifier = Modifier.padding(8.dp))

    }
    Row (Modifier.fillMaxHeight()){
        Text(text = "Item A", modifier = Modifier.padding(8.dp))

        VerticalDivider(
            modifier = Modifier.fillMaxHeight(), // Ocupa todo el ancho de la columna
            thickness = 5.dp, // Grosor de la línea
            color = Color.Green // Color de la línea divisoria
        )

        Text(text = "Item B", modifier = Modifier.padding(8.dp))

        VerticalDivider(
            modifier = Modifier.fillMaxHeight(),
            thickness = 6.dp, // Grosor más grueso
            color = Color.Magenta
        )

        Text(text = "Item C", modifier = Modifier.padding(8.dp))

        VerticalDivider(
            modifier = Modifier.fillMaxHeight(),
            thickness = 7.dp, // Aún más grueso
            color = Color.DarkGray
        )

        Text(text = "Item D", modifier = Modifier.padding(8.dp))
    }
}


























