package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.black
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.paledark


@Composable
fun TopBar(
    title: String,
    onBackClick: () -> Unit,
    endIcon: ImageVector? = null,
) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 20.dp, top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { onBackClick() }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "",
                tint = black,
                modifier = Modifier.size(32.dp)
            )
        }

        Box(
            modifier = Modifier
            .fillMaxWidth(if(endIcon == null) 1f else .8f)
            ,

        ) {

            Text(
                modifier = Modifier.align(Alignment.Center),
                text = title,
                color = paledark,
                fontWeight = FontWeight.Bold,
                //textAlign = TextAlign.Center,
                fontSize = 16.sp
            )
        }

        endIcon?.let { icon ->
            Card(
                shape = RoundedCornerShape(8.dp),
                elevation = 4.dp
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = icon,
                        contentDescription = ""
                    )
                }
            }
        }


    }

}

@Composable
fun TopBarWithBack(title: String, onBackClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { onBackClick() }) {
            Icon(
                modifier = Modifier.size(32.dp, 32.dp),
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "",
                tint = black
            )
        }

        Text(
            text = title,
            color = paledark,
            modifier = Modifier.padding(start = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        Card(
            modifier = Modifier
                .padding(end = 20.dp)
                .width(50.dp),
            elevation = 4.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = ""
                )

            }
        }

    }

}


@Composable
fun TopBarWithBackProductList(title: String, onBackClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { onBackClick() }) {
            Icon(
                modifier = Modifier.size(32.dp, 32.dp),
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "",
                tint = black
            )
        }
        Text(
            text = title,
            color = paledark,
            modifier = Modifier.padding(start = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )
        Card(
            modifier = Modifier
                .padding(end = 20.dp)
                .width(50.dp),
            shape = RoundedCornerShape(8.dp),
            elevation = 4.dp
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = ""
                )

            }

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Column {

        TopBar(title ="Title", onBackClick = {})
        Spacer(modifier = Modifier.height(16.dp))
        TopBar(title ="Title", onBackClick = {}, endIcon = Icons.Outlined.Favorite)
    }
}

