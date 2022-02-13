package com.artemissoftware.jetpackcomposetutorial4.ui.weather__

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.FurnitureNavigation
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.PrimaryBackground

@Composable
fun WeatherApp() {
        Surface(
                color = PrimaryBackground
        ) {
                WeatherNavigation()
        }


}