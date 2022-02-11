package com.artemissoftware.jetpackcomposetutorial4.ui.weather__

import com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.Screen

sealed class WeatherScreens(val route: String){
    object SplashScreen : WeatherScreens("splash_screen")
    object HomeScreen : WeatherScreens("home_screen")
}
