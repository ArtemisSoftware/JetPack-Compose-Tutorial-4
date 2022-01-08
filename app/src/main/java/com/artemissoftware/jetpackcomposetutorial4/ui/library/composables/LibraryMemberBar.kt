package com.artemissoftware.jetpackcomposetutorial4.ui.library.composables

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
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
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
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.composables.ButtonSection
import com.artemissoftware.jetpackcomposetutorial4.ui.library.models.Book
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.BrandColor
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.LibraryTypography
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.MeditationTypography
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.NewYorkFamily

@Preview(showBackground = true)
@Composable
fun LibraryMemberBar(){

    Row(
        modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 45.dp, bottom = 31.dp)
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

        Text(
            text = "20",
            fontWeight = FontWeight.Bold,
            fontFamily = NewYorkFamily,
            fontSize = 38.sp
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = "Thu",
                fontFamily = NewYorkFamily,
                fontSize = 14.sp,
                color = Color.Gray
            )

            Text(
                text = "Dec 2021",
                fontFamily = NewYorkFamily,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Filled.QrCode,
                contentDescription = "QR Code"
            )
        }

        Image(
            painter = painterResource(id = R.drawable.artemis_3),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .fillMaxHeight()
                .clip(RoundedCornerShape(12.dp))

        )


    }

}