package com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.GroceryTypography
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.LightRed
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.Orange

@Composable
fun BestSellerSection() {
    Column() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Best Sellers",
                style = GroceryTypography.h6
            )
            TextButton(onClick = {}) {
                Text(
                    text = "More",
                    style = GroceryTypography.body1,
                    color = Orange
                )
            }
        }

        BestSellerItems()
    }
}

@Composable
private fun BestSellerItems() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            BestSellerItem(
                imageResource = R.drawable.item_lettuce,
                title = "Iceberg Lettuce",
                price = "1.99",
                discountPercent = 10
            )
        }
        item {
            BestSellerItem(
                imageResource = R.drawable.item_apple,
                title = "Apple",
                price = "2.64",
                discountPercent = 5
            )
        }
        item {
            BestSellerItem(
                imageResource = R.drawable.item_meat,
                title = "Meat",
                price = "4.76",
                discountPercent = 20
            )
        }
    }
}

@Composable
private fun BestSellerItem(
    title: String = "",
    price: String = "",
    discountPercent: Int = 0,
    imageResource: Int
) {
    Card(
        Modifier
            .width(160.dp)
    ) {
        Column(
            Modifier
                .padding(bottom = 32.dp)
        ) {
            Image(
                painter = painterResource(id = imageResource), contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = title, fontWeight = FontWeight.Bold)
                Row {
                    Text(
                        "$${price}",
                        textDecoration = if (discountPercent > 0)
                            TextDecoration.LineThrough
                        else
                            TextDecoration.None,
                        color = if (discountPercent > 0) Color.Gray else Color.Black
                    )
                    if (discountPercent > 0) {
                        Text(text = "[$discountPercent%]", color = LightRed)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun DefaultPreview() {
    BestSellerItem(
        imageResource = R.drawable.item_meat,
        title = "Meat",
        price = "4.76",
        discountPercent = 20
    )
}
