package com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.composables.*
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.models.BottomMenuContent
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.models.Feature
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.DeepBlue

@ExperimentalFoundationApi
@Composable
fun MeditationScreen() {

    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {

        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression"))
            CurrentMeditation()

            FeatureSection(
                features = Feature.getMock()
            )
        }


        BottomMenu(
            items = BottomMenuContent.getMock(),
            modifier = Modifier.align(alignment = Alignment.BottomEnd),
        )

    }
}



@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MeditationScreen()
}