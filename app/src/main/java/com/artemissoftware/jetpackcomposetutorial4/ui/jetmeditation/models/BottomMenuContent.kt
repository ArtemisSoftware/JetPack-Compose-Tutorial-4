package com.artemissoftware.jetpackcomposetutorial4.ui.jetmeditation.models

import androidx.annotation.DrawableRes
import com.artemissoftware.jetpackcomposetutorial4.R

data class BottomMenuContent(
    val title: String,
    @DrawableRes val iconId: Int
){

    companion object{

        fun getMock(): List<BottomMenuContent>{

            return listOf(
                BottomMenuContent("Home", R.drawable.ic_home),
                BottomMenuContent("Meditate", R.drawable.ic_bubble),
                BottomMenuContent("Sleep", R.drawable.ic_moon),
                BottomMenuContent("Music", R.drawable.ic_music),
                BottomMenuContent("Profile", R.drawable.ic_profile),
            )

        }
    }

}
