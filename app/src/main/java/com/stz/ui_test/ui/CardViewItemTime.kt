package com.stz.ui_test.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardViewItemTime() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .align(alignment = Alignment.CenterVertically)
        ) {
            Text(text = "Duration",
                fontSize = 12.sp)
            Text(
                text = "50mins",
                fontSize = 12.sp
            )
        }
        Box(
            modifier = Modifier
                .width(1.dp) // Sets the width of the box to 1dp for a thin line
                .height(60.dp / 2) // Adjust height to visually represent desired line height
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color.LightGray,
                            Color.LightGray
                        )
                    )
                )
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
        ) {
            Text(text = "Time",
                fontSize = 12.sp)
            Text(
                text = "15:00 - 17:00",
                fontSize = 12.sp
            )
        }
        Box(
            modifier = Modifier
                .width(1.dp) // Sets the width of the box to 1dp for a thin line
                .height(100.dp / 2) // Adjust height to visually represent desired line height
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color.LightGray,
                            Color.LightGray
                        )
                    )
                )
        )
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
                .align(Alignment.CenterVertically),
            text = "2 spots left",
            color = Color(0xff999d26),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        )
    }
}

@Preview
@Composable
private fun CardViewItemPreview() {
    Surface {
        CardViewItemTime()
    }
}