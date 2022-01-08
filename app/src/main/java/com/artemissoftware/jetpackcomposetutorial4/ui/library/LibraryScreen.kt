package com.artemissoftware.jetpackcomposetutorial4.ui.library

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.ui.library.composables.NewArrivalsSection

@ExperimentalMaterialApi
@Composable
fun LibraryScreen() {

    Surface(color = MaterialTheme.colors.background) {

        val sheetState = rememberBottomSheetScaffoldState()

        BottomSheetScaffold(
            scaffoldState = sheetState,
            sheetPeekHeight = 260.dp,
            topBar = {

            },
            sheetContent = {

            },

        ){ paddingValues ->

            NewArrivalsSection(paddingValues = paddingValues)
        }
    }

}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LibraryScreen()
}
