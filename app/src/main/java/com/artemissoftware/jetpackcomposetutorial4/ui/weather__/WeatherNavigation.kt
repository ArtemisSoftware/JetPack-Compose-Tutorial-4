package com.artemissoftware.jetpackcomposetutorial4.ui.weather__

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.*

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = WeatherScreens.SplashScreen.route
    ) {
        composable(WeatherScreens.SplashScreen.route) {
            WeatherSplashScreen(/*navController = navController*/)
        }
        composable(WeatherScreens.HomeScreen.route) {
            WeatherHomeScreen(/*navController = navController*/)
        }


    }
}