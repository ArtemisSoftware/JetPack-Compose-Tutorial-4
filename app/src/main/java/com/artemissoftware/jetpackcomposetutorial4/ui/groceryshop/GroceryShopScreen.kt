package com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.composables.BestSellerSection
import com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.composables.CategorySection
import com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.composables.Header
import com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.composables.Promotions

@Composable
fun GroceryShopScreen() {

    Surface(color = MaterialTheme.colors.background) {


        Box(/*
            modifier = Modifier
                .verticalScroll(rememberScrollState())*/) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = 0.dp, y = (-30).dp),
                painter = painterResource(id = R.drawable.bg_main),
                contentDescription = "Header Background",
                contentScale = ContentScale.FillWidth
            )
            Column {
                //AppBar()

                Column() {
                    Header()
                    Spacer(modifier = Modifier.height(16.dp))
                    Promotions()
                    Spacer(modifier = Modifier.height(16.dp))
                    CategorySection()
                    Spacer(modifier = Modifier.height(16.dp))
                    BestSellerSection()
                }
            }
        }




    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    GroceryShopScreen()
}
