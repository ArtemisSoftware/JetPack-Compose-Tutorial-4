package com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.Greeting
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.composables.ChipSection
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.composables.CurrentMeditation
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.composables.FeatureSection
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.composables.GreetingSection
import com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.models.Feature
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.DeepBlue
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.JetPackComposeTutorial4Theme

@ExperimentalFoundationApi
@Composable
fun HomeScreen() {

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

    }
}



@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    HomeScreen()
}