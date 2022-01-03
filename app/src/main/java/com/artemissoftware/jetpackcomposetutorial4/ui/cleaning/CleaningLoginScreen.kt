package com.artemissoftware.jetpackcomposetutorial4.ui.cleaning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.orangish
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.purplish

@Preview(showBackground = true)
@Composable
fun CleaningLoginScreen() {

    Box {
        LoginOptions()
        MainCard()

    }
}

@Composable
private fun LoginOptions() {

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
            Row() {

                Image(painter = painterResource(id = R.drawable.ic_fb), contentDescription = "facebook")
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Image(painter = painterResource(id =  R.drawable.ic_google), contentDescription = "google")
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Image(painter = painterResource(id = R.drawable.ic_twitter), contentDescription = "twitter")

            }
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            Text(text = signupText, color = Color.White)
        }
    }
}


@Composable
private fun MainCard() {

    val emailState = remember { mutableStateOf(TextFieldValue("artemis@olympus.com")) }
    val passState = remember { mutableStateOf(TextFieldValue("")) }

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
        )
    ) {

        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

            Image(painter = painterResource(id = R.drawable.ic_vaccum), contentDescription = "vaccum")
            Spacer(modifier = Modifier.padding(16.dp))

            OutlinedTextField(
                value = emailState.value,
                onValueChange = { value ->
                    emailState.value = value
                },
                label = { Text(text = "Email address") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email"
                    )
                },
                modifier = modifier
            )


            Spacer(modifier = Modifier.padding(6.dp))

            OutlinedTextField(
                value = passState.value,
                onValueChange = { value ->
                    passState.value = value
                },
                modifier = modifier,
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "Lock"
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
            )

            Spacer(modifier = Modifier.padding(vertical = 12.dp))

            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.disabled) {
                Text(text = "Forgot password?", textAlign = TextAlign.End, modifier = modifier)
            }
            Spacer(modifier = Modifier.padding(vertical = 12.dp))

            Button(
                onClick = {},
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(backgroundColor = orangish),
                modifier = modifier
                    .padding(16.dp),
            ) {
                Text(text = "Log In", color = Color.White)
            }
        }
    }
}

