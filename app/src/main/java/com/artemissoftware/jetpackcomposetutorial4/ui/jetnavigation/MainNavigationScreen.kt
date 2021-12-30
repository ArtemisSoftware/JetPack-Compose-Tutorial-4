package com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation.models.Screen
import com.artemissoftware.jetpackcomposetutorial4.ui.meditation.MeditationScreen

@Composable
fun MainNavigationScreen(
    navController: NavController
){

    var text by remember { mutableStateOf("") }
    
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp)
    ) {

        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                navController.navigate(Screen.DetailScreen.withArgs(text))
            },
            modifier = Modifier.align(Alignment.End)
        ) {

            Text(text = "To DetailScreen")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    var text by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp)
    ) {

        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {

            },
            modifier = Modifier.align(Alignment.End)
        ) {

            Text(text = "To DetailScreen")
        }
    }
}