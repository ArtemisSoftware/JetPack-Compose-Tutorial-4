package com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.models

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.artemissoftware.jetpackcomposetutorial4.R

data class ImageWithText(
    val image: Int,
    val text: String
){

    companion object{

        fun getMock(): List<ImageWithText>{

            return listOf(
                ImageWithText(
                    image = R.drawable.youtube,
                    text = "YouTube"
                ),
                ImageWithText(
                    image = R.drawable.qa,
                    text = "Q&A"
                ),
                ImageWithText(
                    image = R.drawable.discord,
                    text = "Discord"
                ),
                ImageWithText(
                    image = R.drawable.telegram,
                    text = "Telegram"
                ),
            )

        }

    }


}
