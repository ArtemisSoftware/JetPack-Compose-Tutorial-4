package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
fun FurnitureShopApp() {
        Surface(color = MaterialTheme.colors.background) {
            FurnitureNavigation()
        }

}