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


@Composable
fun NewArrivalsSection(paddingValues: Dp = 0.dp) {

    Column(
        modifier = Modifier.padding(paddingValues),
    ) {

        NewArrivalsOptionBar()

        Spacer(modifier = Modifier.height(16.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 28.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(Book.getMock()) { book ->
                NewArrival(book = book)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun NewArrivalsOptionBar() {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 28.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = "New arrivals",
            fontWeight = FontWeight.Bold,
            fontFamily = NewYorkFamily,
            fontSize = 20.sp,
            modifier = Modifier.weight(1f)
        )

        TextButton(
            onClick = {},
            contentPadding = PaddingValues(horizontal = 0.dp)
        ){
            Text(
                text = "View all",
                fontSize = 12.sp,
                style = LibraryTypography.subtitle1,
                color = BrandColor
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                tint = BrandColor,
                imageVector = Icons.Filled.ChevronRight,
                modifier = Modifier.size(16.dp),
                contentDescription = "View all"
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun NewArrival(book: Book = Book.getMock()[0]) {


    Column(modifier = Modifier
        .width(130.dp)
        .clickable { }) {

        Image(
            painter = painterResource(id = book.image),
            contentDescription = "Book Cover",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = book.title,
            fontFamily = NewYorkFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = book.author,
            color = Color.Gray,
            style = LibraryTypography.subtitle1,
            fontSize = 13.sp
        )

    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    NewArrivalsSection()
}

