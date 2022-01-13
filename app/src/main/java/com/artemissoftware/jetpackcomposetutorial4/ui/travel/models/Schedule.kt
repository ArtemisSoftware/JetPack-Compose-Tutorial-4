package com.artemissoftware.jetpackcomposetutorial4.ui.travel.models

data class Schedule(
    val title: String,
    val detail: String
){

    companion object{

        fun getMockList(): List<Schedule>{

            return listOf(
                Schedule(
                    title = "Day 1: Bangkok",
                    detail = "Our Thailand itinerary starts in Bangkok. This is the capital city of Thailand and where most international travelers will arrive in the country.\n" +
                            "I recommend you allocate 3 days to explore. This will give you time to adjust to the climate and any time difference. It will also give you time to sightsee in the city itself, and also to take a day trip to a nearby UNESCO world heritage site. More on that shortly. First, let’s look at what you should get up to in Bangkok."
                ),
                Schedule(
                    title = "Day 2: Kanchanaburi",
                    detail = "From Bangkok, my next recommended destination is Kanchanaburi. Whilst the name of the town might not instantly ring any bells, the river it sits on probably will, it’s the River Kwai, famous for its bridge, the story of which was turned into a film."
                ),
                Schedule(
                    title = "Day 3: Ayutthaya",
                    detail = "From Kanchanaburi I’d suggest heading to one of Thailand’s old capital cities. There are two main options to choose from, Ayutthaya and Sukhothai, and on a shorter trip like this, I think picking just one of these two will suffice."
                ),
                Schedule(
                    title = "Day 4: Khao Sok",
                    detail = "Now it’s time to head south, to one of my favourite spots in Thailand – Khao Sok National Park. This place is, for some reason, not well visited, but it is truly unlike anywhere else I visited in the country."
                ),
            )


        }

    }

}
