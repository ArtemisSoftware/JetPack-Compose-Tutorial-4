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
import com.google.accompanist.insets.navigationBarsPadding

@Preview(showBackground = true)
@Composable
fun TravelHomeScreen(){

    Column {

        HomeHeader()

        Text(
            text = "TRENDING TRIP IDEAS",
            color = Color.Black,
            fontFamily = TripFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier.padding(
                top = 20.dp,
                start = 16.dp,
                bottom = 16.dp
            ),
        )

        LazyColumn(

        ) {

            items(Trip.getMock()) { trip ->

                TripItem(trip = trip)
            }

            item {
                Spacer(modifier = Modifier.navigationBarsPadding())
            }

        }
    }
}