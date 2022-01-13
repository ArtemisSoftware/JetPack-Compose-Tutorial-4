package com.artemissoftware.jetpackcomposetutorial4.ui.travel.models

data class Destination(
    val location : String,
    val title: String,
    val review : String
){

    companion object{
        fun getMock(): Destination{
            return Destination(
                location = "Thailand",
                title = "How to get around thailand on a cheap budget in 2021",
                review =  "4.8 (2.5k reviews)"
            )
        }
    }

}
