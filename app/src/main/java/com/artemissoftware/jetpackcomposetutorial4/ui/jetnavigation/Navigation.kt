package com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation.models.Screen

@Composable
fun Navigation(){

    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Screen.MainScreen.route){

        composable(route = Screen.MainScreen.route){
            MainNavigationScreen(navController = navHostController)
        }

        composable(
            //route = Screen.DetailScreen.route + "/{name}/{age}", //multiple arguments
            //route = Screen.DetailScreen.route + "?name={name}", //optional argument
            route = Screen.DetailScreen.route + "/{name}", //mandatory argument
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "No arguments"
                    nullable = true
                }
            )
        ){ entry->
            DetailNavigationScreen(name = entry.arguments?.getString("name"))
        }
    }
    
}