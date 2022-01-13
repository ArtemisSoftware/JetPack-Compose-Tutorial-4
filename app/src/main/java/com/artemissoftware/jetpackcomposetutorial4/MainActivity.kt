package com.artemissoftware.jetpackcomposetutorial4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.jetpackcomposetutorial4.ui.cleaning.CleaningLoginScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.cleaning.CleaningOnBoardingScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.groceryshop.GroceryShopScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.jetnavigation.Navigation
import com.artemissoftware.jetpackcomposetutorial4.ui.library.LibraryScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.meditation.MeditationScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.JetPackComposeTutorial4Theme
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.SplashScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.TravelHomeScreen

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTutorial4Theme {

                //MeditationScreen()
                //InstagramProfileScreen()
                //Navigation()
                //CleaningLoginScreen()
                //Cleaning()
                //GroceryShopScreen()
                //LibraryScreen()
                //TravelHomeScreen()
                SplashScreen()
            }
        }
    }
}


@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    //LibraryScreen()
}
