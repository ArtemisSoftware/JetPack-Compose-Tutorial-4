package com.artemissoftware.jetpackcomposetutorial4

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop.FurnitureShopApp
import com.artemissoftware.jetpackcomposetutorial4.ui.instagramprofile.InstagramProfileScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.library.LibraryScreen
import com.artemissoftware.jetpackcomposetutorial4.ui.neonavigation.NeoNavigationDestinations
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.JetPackComposeTutorial4Theme
import com.artemissoftware.jetpackcomposetutorial4.ui.weather__.WeatherApp

class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
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
                //SplashScreen()
                //TripDetailScreen()

                //FurnitureShopApp()
                WeatherApp()

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
