package com.artemissoftware.jetpackcomposetutorial4.ui.weather

sealed class WeatherScreens(val route: String){
    object SplashScreen : WeatherScreens("splash_screen")
    object HomeScreen : WeatherScreens("home_screen")
}
