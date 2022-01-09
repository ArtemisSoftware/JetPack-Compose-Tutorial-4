package com.artemissoftware.jetpackcomposetutorial4.ui.travel.models

data class Trip(
    val image: String,
    val dayPerson: String,
    val title: String,
    val rating: Float
){

    companion object{

        fun getMock(): List<Trip>{
            return listOf<Trip>(
                Trip(
                    "https://imgcld.yatra.com/ytimages/image/upload/t_holidays_srplist_tablet_hc/v1501843603/DO_NOT_USE_Editorial_Images/Grand_palace_and_Wat_phra_keaw.jpg",
                    "7 Days / 2 Person",
                    "Thailand Super Saver with only $1000 in 2021",
                    4.8f
                ),

                Trip(
                    "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cmsfeatured/south-india-tour-package-1555403191-785X440.jpg",
                    "7 Days / 2 Person",
                    "How to get around India on the cheap budget in 2021",
                    5.9f
                ),

                Trip(
                    "https://imgcld.yatra.com/ytimages/image/upload/t_holidays_srplist_tablet_hc/v1501843603/DO_NOT_USE_Editorial_Images/Grand_palace_and_Wat_phra_keaw.jpg",
                    "7 Days / 2 Person",
                    "Thailand Super Saver with only $1000 in 2021",
                    4.8f
                ),

                Trip(
                    "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cmsfeatured/south-india-tour-package-1555403191-785X440.jpg",
                    "7 Days / 2 Person",
                    "How to get around India on the cheap budget in 2021",
                    5.9f
                ),


                Trip(
                    "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cmsfeatured/south-india-tour-package-1555403191-785X440.jpg",
                    "7 Days / 2 Person",
                    "How to get around India on the cheap budget in 2021",
                    5.9f
                ),

                Trip(
                    "https://imgcld.yatra.com/ytimages/image/upload/t_holidays_srplist_tablet_hc/v1501843603/DO_NOT_USE_Editorial_Images/Grand_palace_and_Wat_phra_keaw.jpg",
                    "7 Days / 2 Person",
                    "Thailand Super Saver with only $1000 in 2021",
                    4.8f
                ),

            )
        }

    }

}
