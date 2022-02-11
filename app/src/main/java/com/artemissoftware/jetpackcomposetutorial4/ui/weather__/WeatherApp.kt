package com.artemissoftware.jetpackcomposetutorial4.ui.weather__

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.FurnitureNavigation

@Composable
fun WeatherApp() {
    Surface(color = MaterialTheme.colors.background) {
        WeatherNavigation()
    }

}