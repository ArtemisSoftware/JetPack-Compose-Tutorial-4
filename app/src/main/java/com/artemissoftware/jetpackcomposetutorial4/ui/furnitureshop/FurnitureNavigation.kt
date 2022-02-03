package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FurnitureNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
//        composable(Screen.DashboardScreen.route) {
//            DashboardScreen()
//        }
//        composable(Screen.ProductListScreen.route) {
//            ProductListScreen()
//        }
//
//        composable(Screen.ProductDetailScreen.route) {
//            ProductDetailsScreen()
//        }
//
    }
}