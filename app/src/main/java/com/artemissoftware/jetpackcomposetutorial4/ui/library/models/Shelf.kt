package com.artemissoftware.jetpackcomposetutorial4.ui.library.models

import com.artemissoftware.jetpackcomposetutorial4.R

data class Shelf (
    val book: Book,
    val returnDate: String,
    val timeLeftPercentage: Float
){

    companion object{

        fun getMock(): List<Shelf> {
            return listOf(
                Shelf(Book("Just My Type", R.drawable.book_just_my_type, "Simon Garfield"), "25.03.2022", 75f),
                Shelf(Book.getMock()[0], "25.02.2022", 80f),
                Shelf(Book.getMock()[1], "21.01.2022", 90f),
            )
        }

    }
}