package com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailNavigationScreen(
    name: String?
){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "You navigated to details with argument <$name>")
    }
}



@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DetailNavigationScreen("Artemis")
}