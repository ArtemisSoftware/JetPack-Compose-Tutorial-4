package com.artemissoftware.jetpackcomposetutorial4.ui.furnitureshop

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
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
    val scale = remember { Animatable(0f) }
    val overshootInterpolator = remember { OvershootInterpolator(2f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 2.5f,
            animationSpec = tween(
                durationMillis = 1500,
                easing = {
                    overshootInterpolator.getInterpolation(it)
                }
            )
        )
        delay(FurnitureshopConstants.SPLASH_SCREEN_DURATION)
        navController.popBackStack()
        navController.navigate(Screen.DashboardScreen.route)

    }

    SplashContent(scale)

}


@Composable
private fun SplashContent(scale: Animatable<Float, AnimationVector1D>) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.furniture_logo),
            contentDescription = "Logo",
            modifier = Modifier.scale(scale.value)
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    //--SplashContent(scale)
}
