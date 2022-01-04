package com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.GroceryTypography

@Composable
fun Promotions() {
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imageResource = R.drawable.promotion,
                title = "Fruit",
                subtitle = "Start @",
                header = "$1",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imageResource = R.drawable.promotion,
                title = "Meat",
                subtitle = "Discount",
                header = "20%",
                backgroundColor = Color(0xff6EB6F5)
            )
        }
    }
}

@Composable
private fun PromotionItem(
    title: String = "",
    subtitle: String = "",
    header: String = "",
    backgroundColor: Color = Color.Transparent,
    imageResource: Int
) {
    Card(
        Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        Row {
            Column(
                Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    style = GroceryTypography.body1,
                    color = Color.White
                )

                Text(
                    text = subtitle,
                    fontSize = 16.sp,
                    color = Color.White,
                    style = GroceryTypography.body1,
                    fontWeight = FontWeight.Bold)

                Text(
                    text = header,
                    fontSize = 28.sp,
                    color = Color.White,
                    style = GroceryTypography.body1,
                    fontWeight = FontWeight.Bold
                )
            }

            Image(
                painter =  painterResource(id = imageResource), contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}


@Preview(showBackground = false)
@Composable
private fun DefaultPreview() {
    PromotionItem(
        title = "Fruit",
        subtitle = "Start @",
        header = "$1",
        backgroundColor = Color(0xff6EB6F5),
        imageResource = R.drawable.promotion)

    //--Promotions()
}
