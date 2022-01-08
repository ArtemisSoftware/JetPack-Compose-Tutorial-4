package com.artemissoftware.jetpackcomposetutorial4.ui.library.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreVert
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
import com.artemissoftware.jetpackcomposetutorial4.ui.library.models.Shelf
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.BrandColor
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.LibraryTypography
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.MeditationTypography
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.NewYorkFamily

@Preview(showBackground = true)
@Composable
fun BookShelfSection() {

    ShelfTitle(title = "My books")
    LazyColumn(

    ) {

        items(Shelf.getMock()) { shelf ->

            BookItem(shelf = shelf)
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun ShelfTitle(title: String = "My books shelf") {
    Text(
        text = title,
        fontFamily = NewYorkFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier.padding(horizontal = 28.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun BookItem(shelf: Shelf = Shelf.getMock()[1]) {

    Row(
        modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(horizontal = 28.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)

    ){
        Image(
            painter = painterResource(id = shelf.book.image),
            contentScale = ContentScale.FillHeight,
            contentDescription = "Cover",
            modifier = Modifier
                .fillMaxHeight()
                .clip(RoundedCornerShape(8.dp))
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = shelf.book.title,
                fontFamily = NewYorkFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = shelf.book.author,
                style = LibraryTypography.subtitle1,
                fontSize = 13.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Return until ${shelf.returnDate}",
                color = BrandColor,
                fontSize = 13.sp,
            )
        }

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Filled.MoreVert,
                tint = BrandColor,
                contentDescription = "Menu"
            )
        }

    }
}