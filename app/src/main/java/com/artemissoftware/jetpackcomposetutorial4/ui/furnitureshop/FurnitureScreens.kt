package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object DashboardScreen : Screen("dashboard_screen")
    object ProductListScreen : Screen("product_list_screen")
    object ProductDetailScreen : Screen("product_detail_screen")

}