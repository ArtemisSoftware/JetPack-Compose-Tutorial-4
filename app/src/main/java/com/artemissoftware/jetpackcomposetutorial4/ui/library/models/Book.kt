package com.artemissoftware.jetpackcomposetutorial4.ui.library.models

import com.artemissoftware.jetpackcomposetutorial4.R

data class Book(
    val title: String,
    val image: Int,
    val author: String
) {

    companion object{

        fun getMock(): List<Book>{
            return listOf(
                Book("Muscle", R.drawable.book_muscle, "Alan Trotter"),
                Book("Dominicana", R.drawable.book_dominicana, "Angie Cruz"),
                Book("A New Program for Graphic Design", R.drawable.book_a_new, "David Reinfurt"),
            )

        }


    }

}