package com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NeoNavigationDestinations() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable(
            route = "profile/{name}/{userId}/{timestamp}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                },
                navArgument("userId") {
                    type = NavType.StringType
                },
                navArgument("timestamp") {
                    type = NavType.LongType
                },
            )
        ) {
            val name = it.arguments?.getString("name")!!
            val userId = it.arguments?.getString("userId")!!
            val timestamp = it.arguments?.getLong("timestamp")!!

            ProfileScreen(
                navController = navController,
                name = name,
                userId = userId,
                created = timestamp
            )
        }


        composable("post/{showOnlyPostsByUser}", arguments = listOf(
            navArgument("showOnlyPostsByUser") {
                type = NavType.BoolType
                defaultValue = false
            }
        )) {
            val showOnlyPostsByUser =
                it.arguments?.getBoolean("showOnlyPostsByUser") ?: false
            PostScreen(showOnlyPostsByUser)
        }
    }

}

