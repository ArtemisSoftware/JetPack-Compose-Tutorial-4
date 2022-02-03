package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.artemissoftware.jetpackcomposetutorial4.R
import com.artemissoftware.jetpackcomposetutorial4.util.FurnitureshopConstants
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
//    val scale = remember {
//        Animatable(0f)
//    }
//    val overshootInterpolator = remember {
//        OvershootInterpolator(2f)
//    }
    LaunchedEffect(key1 = true) {
//        scale.animateTo(
//            targetValue = 0.5f,
//            animationSpec = tween(
//                durationMillis = 500,
//                easing = {
//                    overshootInterpolator.getInterpolation(it)
//                }
//            )
//        )
        delay(FurnitureshopConstants.SPLASH_SCREEN_DURATION)
        navController.popBackStack()
        navController.navigate(Screen.DashboardScreen.route)

    }

    SplashContent()

}


@Composable
private fun SplashContent(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.furniture_logo),
            contentDescription = "Logo",
//            modifier = Modifier.scale(scale.value)
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SplashContent()
}
