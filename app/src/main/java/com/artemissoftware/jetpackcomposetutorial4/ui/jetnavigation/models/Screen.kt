package com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation.models

sealed class Screen(val route: String){

    object MainScreen: Screen("main_screen")
    object DetailScreen: Screen("detail_screen")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

}
