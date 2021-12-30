package com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.ButtonSection
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.HighlightSection
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.ProfileSection
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.TopBar
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.models.ImageWithText

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

        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection(modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(
            highlights = ImageWithText.getMock(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )

    }

}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    InstagramProfileScreen()
}