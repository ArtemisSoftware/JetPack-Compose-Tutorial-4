package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.components.TopBar
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.*

@Composable
fun ProductListScreen(
    navController: NavController
) {
    Box(Modifier.verticalScroll(rememberScrollState())) {

        Column() {
            TopBar(
                title = "Armchairs",
                onBackClick = {
                    navController.navigateUp()
                },
                endIcon = Icons.Default.ShoppingCart
            )
            Column() {
                ContentList()

            }
        }

    }
}

@Composable
private fun ContentList() {
    Column() {
        SortFilter()
        Spacer(modifier = Modifier.padding(24.dp))
        Products()

    }
}


@Composable
private fun SortFilter() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = white),
            border = BorderStroke(1.dp, platinum),
            modifier = Modifier
                .padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.List,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(
                text = "Sort",
                color = black
            )


        }

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = white),
            shape = RoundedCornerShape(8.dp),
            elevation = ButtonDefaults.elevation(8.dp),
            modifier = Modifier
                .padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.List,
                contentDescription = "",
                tint = black,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(
                text = "Filter",
                color = black
            )


        }
    }
}


@Composable
fun Products() {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        item {
            LeftSide()
            RightSide()
        }
    }

}


@Composable
fun LeftSide() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        FurnituretItem(
            imagePainter = painterResource(id = R.drawable.furniture_4),
            title = "Matteo Armchair",
            price = "$240"
        )
        FurnituretItem(
            imagePainter = painterResource(id = R.drawable.furniture_5),
            title = "Primorse Accent",
            price = "$761"
        )
        FurnituretItem(
            imagePainter = painterResource(id = R.drawable.furniture_6),
            title = "Crandall 21",
            price = "$761"
        )
    }
}

@Composable
fun LeftItem(
    imagePainter: Painter,
    title: String = "",
    price: String = ""
) {

    Card(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .clickable {
            },
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(text = title, color = texttitlewhite)
            Text(text = price, fontWeight = FontWeight.Bold)
        }
    }

    Box(
        modifier = Modifier
            .offset
                (20.dp, (-190).dp)
            .height(120.dp)
    ) {
        Image(
            contentScale = ContentScale.Fit,
            painter = imagePainter,
            contentDescription = "",
            modifier = Modifier.aspectRatio(1f)
        )
    }


}


@Composable
fun RightSide() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 16.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        RightItem(
            imagePainter = painterResource(id = R.drawable.furniture_1),
            title = "Araceli Armchair",
            price = "$240"
        )
        RightItem(
            imagePainter = painterResource(id = R.drawable.furniture_2),
            title = "Nolin Armchair",
            price = "$332.0"
        )
        RightItem(
            imagePainter = painterResource(id = R.drawable.furniture_3),
            title = "Donham Armchair",
            price = "$555.0"
        )
    }
}

@Composable
fun RightItem(
    imagePainter: Painter,
    title: String = "",
    price: String = ""
) {
    Card(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .clickable {
            },
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(text = title, color = texttitlewhite)
            Text(text = price, fontWeight = FontWeight.Bold)
        }
    }

    Box(
        modifier = Modifier
            .offset
                (20.dp, (-210).dp)
            .height(120.dp)
    ) {
        Image(
            contentScale = ContentScale.Fit,
            painter = imagePainter,
            contentDescription = "",
            modifier = Modifier.aspectRatio(1f)
        )
    }
}

@Composable
private fun FurnituretItem(
    imagePainter: Painter,
    title: String = "",
    price: String = ""
) {

    Box {
        Card(
            modifier = Modifier
                .size(150.dp),
            elevation = 10.dp,
            shape = RoundedCornerShape(20.dp)
        ) {

            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = title,
                    color = texttitlewhite,
                    fontFamily = FurnitureFontFamily,
                )
                Text(
                    text = price,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FurnitureFontFamily,
                )
            }

        }
        Box(
            modifier = Modifier
                .offset(
                    x = 20.dp,
                    y = (-260).dp
                )
                .height(120.dp)
        ){
            Image(
                contentScale = ContentScale.Fit,
                painter = imagePainter,
                contentDescription = "",
                modifier = Modifier.aspectRatio(1f)
            )
        }

    }


    Spacer(modifier = Modifier.height(60.dp))






}


@Preview(showBackground = true)
@Composable
private fun DefaultFurnituretItemPreview() {

    Column {

        FurnituretItem(
            imagePainter = painterResource(id = R.drawable.furniture_4),
            title = "Araceli Armchair",
            price = "$240"
        )
        FurnituretItem(
            imagePainter = painterResource(id = R.drawable.furniture_4),
            title = "Araceli Armchair",
            price = "$240"
        )

    }


}

@Preview(showBackground = true)
@Composable
private fun DefaultLeftItemPreview() {

    Column {


        LeftSide()
    }


}


@Preview(showBackground = true)
@Composable
private fun DefaultLeftItemPreview_2() {

    Column {


        RightSide()
    }


}