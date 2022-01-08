package com.artemissoftware.jetpackcomposetutorial4.ui.library

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.artemissoftware.jetpackcomposetutorial4.ui.library.composables.BookShelfSection
import com.artemissoftware.jetpackcomposetutorial4.ui.library.composables.LibraryMemberBar
import com.artemissoftware.jetpackcomposetutorial4.ui.library.composables.NewArrivalsSection

@ExperimentalMaterialApi
@Composable
fun LibraryScreen() {

    Surface(color = MaterialTheme.colors.background) {

        val sheetState = rememberBottomSheetScaffoldState()
        var peekHeightPx by remember { mutableStateOf(0) }

        BottomSheetScaffold(
            scaffoldState = sheetState,
            sheetPeekHeight = GetSheetPeekHeight(peekHeightPx),
            sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 12.dp),
            topBar = {
                LibraryMemberBar()
            },
            sheetContent = {

                Spacer(modifier = Modifier.height(16.dp))
                BookShelfSection()
            },

        ){ paddingValues ->

            NewArrivalsSection(paddingValues = paddingValues)
        }



    }

}



@Composable
private fun GetSheetPeekHeight(peekHeightPx: Int): Dp {
    return if (peekHeightPx == 0) {
        BottomSheetScaffoldDefaults.SheetPeekHeight
    } else {
        // The value from onGloballyPositioned is in px and needs to be converted back to a dp value, and 8 needs to be added for the padding and 8 for the spacing between
        (with(LocalDensity.current) { peekHeightPx / density } + 16).dp
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LibraryScreen()
}
