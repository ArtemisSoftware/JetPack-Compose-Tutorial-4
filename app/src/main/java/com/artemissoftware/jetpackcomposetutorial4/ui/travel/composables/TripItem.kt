package com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
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
import com.google.accompanist.coil.rememberCoilPainter


@Preview(showBackground = true)
@Composable
fun TripItem(
    trip: Trip = Trip.getMock()[0],
    //--navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)

    ) {


        Image(
            painter = rememberCoilPainter(request = trip.image, fadeIn = true),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
//                .clickable {
//                    //--navController.navigate("detail")
//                }
                .height(200.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))


        Row() {

            Text(
                text = trip.dayPerson,
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = Color(255, 215, 0),
                modifier = Modifier
                    .padding(4.dp)
                    .size(12.dp)
                    .align(CenterVertically)
            )

            Text(
                text = trip.rating.toString(),
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
            )
        }

        Text(
            text = trip.title,
            fontFamily = TripFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 24.sp
        )


    }

}

