package com.artemissoftware.jetpackcomposetutorial4.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.R

val gothicA1 = FontFamily(
    listOf(
        Font(R.font.gothica1_regular, FontWeight.Normal),
        Font(R.font.gothica1_medium, FontWeight.Medium),
        Font(R.font.gothica1_semibold, FontWeight.SemiBold),
        Font(R.font.gothica1_bold, FontWeight.Bold),
        Font(R.font.gothica1_black, FontWeight.Black),
    )
)


// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),




)





// Set of Material typography styles to start with
val MeditationTypography = Typography(
    body1 = TextStyle(
        color = AquaBlue,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    h1 = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h2 = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)

val nunitoFamily = FontFamily(
    Font(R.font.nunito_light, FontWeight.Light),
    Font(R.font.nunito_regular, FontWeight.Normal),
    Font(R.font.nunito_regular, FontWeight.Medium),
    Font(R.font.nunito_bold, FontWeight.Bold)
)

val GroceryTypography = Typography(
    defaultFontFamily = nunitoFamily
)


val PoppinsFamily = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)

val NewYorkFamily = FontFamily(
    Font(R.font.newyork)
)

val LibraryTypography = Typography(
    defaultFontFamily = PoppinsFamily
)



val TripFontFamily = FontFamily(
    Font(R.font.overpass_black, FontWeight.Black),
    Font(R.font.overpass_bold, FontWeight.Bold),
    Font(R.font.overpass_extra_bold, FontWeight.ExtraBold),
    Font(R.font.overpass_extra_light, FontWeight.ExtraLight),
    Font(R.font.overpass_light, FontWeight.Light),
    Font(R.font.overpass_regular, FontWeight.Normal),
    Font(R.font.overpass_semi_bold, FontWeight.SemiBold),
    Font(R.font.overpass_thin, FontWeight.Thin),
)
