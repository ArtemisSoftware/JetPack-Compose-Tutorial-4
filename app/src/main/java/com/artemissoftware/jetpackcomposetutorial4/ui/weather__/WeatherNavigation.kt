package com.artemissoftware.jetpackcomposetutorial4.ui.weather__

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = WeatherScreens.SplashScreen.route
    ) {
        composable(WeatherScreens.SplashScreen.route) {
            WeatherSplashScreen(navController = navController)
            //WeatherSplashScreen()
        }
        composable(WeatherScreens.HomeScreen.route) {
            WeatherHomeScreen()
        }
    }
}