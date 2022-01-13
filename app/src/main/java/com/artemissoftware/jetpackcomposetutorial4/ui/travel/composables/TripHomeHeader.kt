package com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
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
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.ButtonSection
import com.artemissoftware.jetpackcomposetutorial4.ui.library.models.Book
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.*
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Trip
import com.artemissoftware.jetpackcomposetutorial4.util.TripConstants.TRIP_HEADER_BACKGROUND_IMAGE_URL
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.insets.statusBarsPadding


@Composable
@Preview
fun HomeHeader() {

    Box {


        Image(
            painter = rememberCoilPainter(
                request = TRIP_HEADER_BACKGROUND_IMAGE_URL,
                fadeIn = true,
                previewPlaceholder = R.drawable.placeholder
            ),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                    .height(260.dp)
                    .alpha(0.2f)
                    .fillMaxWidth()
        )



        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .statusBarsPadding()
                .padding(16.dp)
        ) {

            Text(
                text = "Good Morning",
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 38.sp,
                letterSpacing = (-1).sp
            )


            Text(
                text = "What do you want to book today ?",
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                letterSpacing = ((-0.2).sp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {


                VerticalButton(vector = Icons.Filled.AirplanemodeActive, text = "Flights")
                VerticalButton(vector = Icons.Filled.DirectionsCar, text = "Cars")
                VerticalButton(vector = Icons.Filled.Business, text = "Hotel")
                VerticalButton(vector = Icons.Filled.LocalShipping, text = "Cruise")

            }


        }
    }

}


@Composable
fun VerticalButton(
    vector: ImageVector,
    text: String
) {

    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = BlueColor),
        shape = RoundedCornerShape(8.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 8.dp),
                imageVector = vector,
                contentDescription = "",
                tint = Color.White
            )

            Text(
                text = text,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

        }


    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewVerticalButton() {
    VerticalButton(
        vector = Icons.Filled.AirplanemodeActive,
        text = "Option"
    )
}