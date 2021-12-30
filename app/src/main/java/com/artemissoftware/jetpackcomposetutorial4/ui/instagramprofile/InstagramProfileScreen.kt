package com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.*
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.models.ImageWithText

@ExperimentalFoundationApi
@Composable
fun InstagramProfileScreen(){

    var selectedTabIndex by remember {
        mutableStateOf(0)
    }


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


        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            imageWithTexts = ImageWithText.getMock_2()
        ) {
            selectedTabIndex = it
        }


        when(selectedTabIndex) {
            0 -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.artemis_3),
                    painterResource(id = R.drawable.artemis_3),
                    painterResource(id = R.drawable.artemis_3),
                    painterResource(id = R.drawable.artemis_3),
                    painterResource(id = R.drawable.artemis_3),
                    painterResource(id = R.drawable.artemis_3),
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }

    }

}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    InstagramProfileScreen()
}