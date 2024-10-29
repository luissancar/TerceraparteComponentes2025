package com.example.tercerapartecomponentes2025

import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import kotlin.math.roundToInt

@Composable
fun MySlider() {
    var sliderPos by rememberSaveable { mutableStateOf(0f) }
    Slider(value = sliderPos, onValueChange = { sliderPos = it })
    Text(sliderPos.toString())
}


@Composable
fun MySlider02() {
    var sliderPos by rememberSaveable { mutableStateOf(0f) }
    var completeValue by rememberSaveable { mutableStateOf("") }
    Slider(
        value = sliderPos,
        onValueChange = { sliderPos = it },
        onValueChangeFinished = {completeValue=sliderPos.roundToInt().toString()},//cuandos epara en un punto
        valueRange = 0f..100f,
        steps = 9 // sin contar el valor inicial y final
    )
    Text(sliderPos.toString())
    Text(completeValue)
}