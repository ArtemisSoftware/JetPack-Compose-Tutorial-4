package com.artemissoftware.jetpackcomposetutorial4.ui.travel.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.jetpackcomposetutorial4.ui.theme.TripFontFamily
import com.artemissoftware.jetpackcomposetutorial4.ui.travel.models.Schedule

@Composable
fun ScheduleItem(schedule: Schedule) {


    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {

        Text(
            text = schedule.title.uppercase(),
            fontSize = 14.sp,
            fontFamily = TripFontFamily,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 0.75.sp
        )


        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = schedule.detail,
            fontSize = 14.sp,
            fontFamily = TripFontFamily,
            fontWeight = FontWeight.Light,
            lineHeight = 18.sp
        )


    }

}


@Preview
@Composable
private fun ScheduleItemPreview() {

    ScheduleItem(Schedule.getMockList()[0])

}
