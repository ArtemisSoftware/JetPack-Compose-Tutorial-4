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
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables.ScheduleResume
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables.TripItem
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Destination
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Schedule
import com.artemissoftware.jetpackcomposetutorial4.util.TripConstants.TRIP_HEADER_IMAGE_URL
import com.google.accompanist.insets.navigationBarsPadding



@Composable
fun DetailHeader(
    //--navController: NavController
) {

    Box() {

        Image(
            painter = rememberCoilPainter(
                request = TRIP_HEADER_IMAGE_URL,
                previewPlaceholder = R.drawable.placeholder
            ),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )


        Box(
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxWidth()
        ) {

            TopButton(
                imageVector = Icons.Default.ArrowBack,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(16.dp)
            ) {
                //--navController.popBackStack()
            }

            TopButton(
                imageVector = Icons.Default.BookmarkBorder,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp)
            ) {

            }

        }


    }

}


@Composable
private fun TopButton(
    imageVector: ImageVector,
    modifier: Modifier,
    clickListener: () -> Unit
) {


    Button(
        onClick = { clickListener() },
        border = BorderStroke(2.dp, Color(0xFFEAFBFF)),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xDDF6F9FF),
            contentColor = Color(0xFF3562D7)
        ),
        modifier = modifier.size(48.dp)

    ) {

        Icon(imageVector = imageVector, contentDescription = "")
    }
}

@Preview
@Composable
private fun DetailHeaderPreview() {
    DetailHeader()

}


@Preview
@Composable
private fun TopButtonPreview() {
    TopButton(
        imageVector = Icons.Default.BookmarkBorder,
        modifier = Modifier
            //.align(Alignment.TopEnd)
            .padding(16.dp)
    ){}

}
