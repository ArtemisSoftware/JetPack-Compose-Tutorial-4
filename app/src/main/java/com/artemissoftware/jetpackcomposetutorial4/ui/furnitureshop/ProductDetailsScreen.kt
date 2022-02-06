package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
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
fun ProductDetailsScreen(
    navController: NavController
) {
    Box(Modifier.verticalScroll(rememberScrollState())) {
        Column {
            TopBar(
                title = "Product",
                onBackClick = {
                    navController.navigateUp()
                },
                endIcon = Icons.Outlined.Favorite
            )
            Column {
                Content()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Content() {
    Column() {
        ProductItemsImage()
        ProductContent()
        ProductAbout()
        Spacer(modifier = Modifier.padding(24.dp))
        ProductAddtoCart()

    }
}

@Composable
private fun ProductItemsImage() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight(),
        ){

            Image(
                painter = painterResource(id = R.drawable.furniture_3),
                contentDescription = "Product Image",
                modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
            )
        }



    }

}

@Composable
private fun ProductContent() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Column() {

            Text(
                text = "Osmond Armchair",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = paledark,
                fontFamily = FurnitureFontFamily,
            )
            Text(
                text = "Chair",
                fontSize = 14.sp,
                color = texttitlewhite,
                fontFamily = FurnitureFontFamily,
            )

        }

        Card(
            modifier = Modifier
                .width(130.dp)
                .height(100.dp),
            elevation = 10.dp
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "$240",
                    fontSize = 18.sp,
                    color = paledark,
                    fontFamily = FurnitureFontFamily,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }



}

@Composable
private fun ProductAbout() {

    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement =  Arrangement.spacedBy(16.dp) //space between elements horizontaly
        ) {

            Box(
                modifier = Modifier
                    .size(30.dp)
                    .border(border = BorderStroke(1.dp, paledark), shape = CircleShape)
                    .padding(4.dp)
                    .clip(shape = CircleShape)
                    .background(orangedark)
            )
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clip(shape = CircleShape)
                    .background(greendark)
            )
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clip(shape = CircleShape)
                    .background(orangelight)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ) {
            Text(
                text = "In a best traditions, constructed of hardwood\n" +
                        "with padding of high-resilient foam.Created\n" +
                        "by awarded winning duo of Manchesti\n" +
                        "Bermadi and Fresco Duli brothers.",
                fontSize = 18.sp,
                color = texttitlewhite,
                fontFamily = FurnitureFontFamily,
                fontWeight = FontWeight.Normal
            )
        }

    }
}

@Composable
private fun ProductAddtoCart() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(addtocart)
        ,
        contentAlignment = Alignment.BottomCenter,
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .offset(
//                        x =16.dp,
                        y = (-40).dp
                    )
                    .fillMaxWidth(0.2f)
                    .size(70.dp),
                shape = RoundedCornerShape(20.dp),
            ) {
                IconButton(
                    modifier = Modifier
                        .background(paleBlack),
                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.ShoppingCart,
                        contentDescription = "",
                        tint = white
                    )

                }
            }


            ClickableText(
                text = AnnotatedString("+ Add to Cart"),
                modifier = Modifier
                    .offset(
//                        x = 16.dp,
                        y = (-30).dp
                    ),
                onClick = { offset ->
                }
            )
        }




    }

}