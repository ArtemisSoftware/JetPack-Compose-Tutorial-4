package com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation.destinations.PostScreenDestination
import com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation.models.User
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

@Destination
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ProfileScreen(
    navigator: DestinationsNavigator,
    user: User
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Profile Screen: $user", textAlign = TextAlign.Center)
        Button(onClick = {
            navigator.navigate(PostScreenDestination())
            //navController.navigate("post/true")
        }) {
            Text("Go to Post Screen")
        }
    }
}