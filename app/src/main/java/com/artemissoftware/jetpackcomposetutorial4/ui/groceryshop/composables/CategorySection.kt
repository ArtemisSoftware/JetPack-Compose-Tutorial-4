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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.GroceryTypography
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.Orange


@Composable
fun CategorySection() {
    Column(Modifier.padding(horizontal = 16.dp)) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Category",
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

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CategoryButton(
                text = "Fruits",
                iconResource = R.drawable.ic_orange,
                backgroundColor = Color(0xffFEF4E7)
            )
            CategoryButton(
                text = "Vegetables",
                iconResource = R.drawable.ic_veg,
                backgroundColor = Color(0xffF6FBF3)
            )
            CategoryButton(
                text = "Dairy",
                iconResource = R.drawable.ic_cheese,
                backgroundColor = Color(0xffFFFBF3)
            )
            CategoryButton(
                text = "Meats",
                iconResource = R.drawable.ic_meat,
                backgroundColor = Color(0xffF6E6E9)
            )
        }
    }
}

@Composable
fun CategoryButton(
    text: String = "",
    iconResource: Int,
    backgroundColor: Color
) {
    Column(
        Modifier
            .width(72.dp)
            .clickable { }
    ) {
        Box(
            Modifier
                .size(72.dp)
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(18.dp)
        ) {
            Image(
                painter = painterResource(id = iconResource),
                contentDescription = "",
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            text = text,
            style = GroceryTypography.body1,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun DefaultPreview() {
    CategoryButton(
        text = "Fruit",
        backgroundColor = Color(0xff6EB6F5),
        iconResource = R.drawable.ic_cheese)

    //--Promotions()
}
