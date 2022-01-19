package com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation.destinations.ProfileScreenDestination
import com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation.models.User
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import java.time.LocalDateTime

@Destination(start = true)
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login Screen")
        Button(onClick = {
            navigator.navigate(ProfileScreenDestination(
                User(
                    name = "Artemis",
                    id = "userid",
                    created = LocalDateTime.now()
                )
            ))
            //navController.navigate("profile/philipp/userid/123456789")
        }) {
            Text("Go to Profile Screen")
        }
    }
}