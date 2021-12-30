package com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.ProfileSection
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.TopBar
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.MeditationScreen

@Composable
fun InstagramProfileScreen(){

    Column(modifier = Modifier.fillMaxSize()) {

        TopBar(
            name = "Artemis Software",
            modifier = Modifier
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        ProfileSection()

    }

}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    InstagramProfileScreen()
}