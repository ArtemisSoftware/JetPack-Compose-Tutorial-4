package com.artemissoftware.jetpackcomposetutorial4.ui.travel

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.library.models.Book
import com.artemissoftware.jetpackcomposetutorial4.ui.library.models.Shelf
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.*
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Trip
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.insets.statusBarsPadding
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables.HomeHeader
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables.TripItem
import com.artemissoftware.jetpackcomposetutorial4.util.TripConstants.TRIP_SPLASH_IMAGE_URL
import com.google.accompanist.insets.navigationBarsPadding

@Composable
fun SplashScreen(
    //navController: NavController
) {
    Box(){

        Image(
            painter = rememberCoilPainter(
                request = TRIP_SPLASH_IMAGE_URL,
                previewPlaceholder = R.drawable.ancient_greece
            ),
            contentDescription = "",
            //contentScale = ContentScale.Crop,
            //modifier = Modifier.fillMaxSize()
        )

        Column(){

            Text(
                text = "Explore\nNew Places",
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                letterSpacing = (-1).sp
            )

            Text(
                text = "Exploria will help you to find new hotels, book cheap flights and lot more.",
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                letterSpacing = (-0.1).sp
            )

            Button(
                onClick = {
                    //--navController.navigate("home")
                },
                modifier = Modifier
                    .padding(8.dp, 24.dp)
                    .fillMaxWidth()
            ) {

                Text(text = "Get Started")

                Spacer(modifier = Modifier.width(8.dp))

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = ""
                )

            }

        }



    }
}

@Preview
@Composable
private fun SplashPreview() {

    SplashScreen()

}