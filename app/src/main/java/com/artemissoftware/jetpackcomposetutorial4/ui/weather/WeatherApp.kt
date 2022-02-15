package com.artemissoftware.jetpackcomposetutorial4.ui.weather

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.PrimaryBackground

@Composable
fun WeatherApp() {
        Surface(
                color = PrimaryBackground
        ) {
                WeatherNavigation()
        }


}