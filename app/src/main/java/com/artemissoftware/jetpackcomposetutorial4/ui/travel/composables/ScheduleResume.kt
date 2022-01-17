package com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables

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
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.TripDetailScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Trip
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.insets.statusBarsPadding
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables.HomeHeader
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables.TripItem
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Destination
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Schedule
import com.google.accompanist.insets.navigationBarsPadding


@Composable
fun ScheduleResume(destination: Destination){

    Column() {

        DestinationRating(destination = destination)

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = destination.title,
            fontFamily = TripFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = (-0.2).sp
        )


        Divider(
            color = Color(0xFFECECEE),
            modifier = Modifier.padding(8.dp)
        )


        Row(
            //horizontalArrangement = Arrangement.SpaceBetween
        ) {

            ScheduleNote(
                imageVector = Icons.Default.CalendarToday,
                title = "Duration",
                subtitle = "7 days"
            )

            ScheduleNote(
                imageVector = Icons.Default.Person,
                title = "Package For",
                subtitle = "2 Person"
            )

            ScheduleNote(
                imageVector = Icons.Default.AttachMoney,
                title = "Apprx Cost",
                subtitle = "800"
            )

        }

        Divider(
            color = Color(0xFFECECEE),
            modifier = Modifier.padding(8.dp)
        )

    }

}

@Composable
private fun DestinationRating(destination: Destination){

    Row {

        LocationChip(text = destination.location)

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "",
            modifier = Modifier
                .padding(end = 8.dp)
                .size(12.dp)
                .align(CenterVertically),
            tint = Color(0xFFFBC110)
        )

        Text(
            text = "4.8 (2.5k reviews)",
            fontFamily = TripFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp
        )


    }

}


@Composable
private fun ScheduleNote(
    imageVector: ImageVector,
    title: String,
    subtitle: String
){

    Row {

        Icon(
            modifier = Modifier
                .padding(8.dp)
                .clip(CircleShape)
                .background(Color(0xFFF5F6FF))
                .size(32.dp)
                .padding(8.dp),
            imageVector = imageVector, contentDescription = ""
        )

        Column {

            Text(
                text = title,
                fontSize = 12.sp,
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.ExtraBold
            )

            Text(
                text = subtitle,
                fontSize = 14.sp,
                fontFamily = TripFontFamily,
                fontWeight = FontWeight.Normal
            )
        }

    }



}


@Preview
@Composable
private fun DestinationRatingPreview() {
    DestinationRating(Destination.getMock())
}

@Preview
@Composable
private fun ScheduleNotePreview() {
    ScheduleNote(
        imageVector = Icons.Default.AttachMoney,
        title = "Apprx Cost",
        subtitle = "800"
    )
}


@Preview
@Composable
private fun ScheduleResumePreview() {
    ScheduleResume(Destination.getMock())
}