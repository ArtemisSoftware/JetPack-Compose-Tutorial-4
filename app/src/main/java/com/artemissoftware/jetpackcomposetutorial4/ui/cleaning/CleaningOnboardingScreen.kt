package com.artemissoftware.jetpackcomposetutorial4.ui.cleaning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.orangish
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.purplish


@Preview(showBackground = true)
@Composable
fun CleaningOnBoardingScreen(){
    Box {
        OnboardingOptions()
        MainCard()
    }
}


@Composable
private fun OnboardingOptions() {
    val signupText = buildAnnotatedString {
        append("Don't have an account? ")
        withStyle(SpanStyle(color = orangish)) {
            append("Sign up here!")
        }
    }

    Surface(
        color = purplish,
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.offset(y = (-30).dp)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .background(color = Color.Gray)
                        .clip(shape = CircleShape)
                )
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))

                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .background(color = Color.White)
                        .clip(shape = CircleShape)
                )
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))

                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .background(color = Color.Gray)
                        .clip(shape = CircleShape)
                )


            }
            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                TextButton(onClick = {}) {
                    Text(text = "Skip", color = Color.White)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = {}) {
                        Text(text = "Next", color = Color.White)
                        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                        Image(painter = painterResource(id = R.drawable.ic_next), contentDescription = "next")

                    }
                }
            }
        }
    }
}


@Composable
private fun MainCard() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .height(600.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 60.dp,
            bottomEnd = 60.dp
        )) {

        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.ic_cleaning), contentDescription = "cleaning")
            Spacer(modifier = Modifier.padding(32.dp))

            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.disabled) {
                Text(text = "Cleaning on Demand", style = MaterialTheme.typography.h6)
            }

            Spacer(modifier = Modifier.padding(vertical = 12.dp))

            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = "Book an appointment in less than 60 seconds and get on the schedule as early as tomorrow.",
                    style = MaterialTheme.typography.caption,
                    textAlign = TextAlign.Center
                )

            }

        }
    }
}

