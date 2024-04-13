package com.stz.ui_test.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stz.ui_test.R


@Composable
fun BottomBarItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(Color.Black)
            .padding(all = 4.dp)
    ) {
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                contentDescription = "Image 1",
                painter = painterResource(id = R.drawable.one),
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Home", color = Color(0xFF797977),
                fontSize = 10.sp)
        }
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                contentDescription = "Image 2",
                painter = painterResource(id = R.drawable.two),
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Upcoming", color = Color(0xFFE9E969),
                fontSize = 10.sp)
        }
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                contentDescription = "Image 3",
                painter = painterResource(id = R.drawable.three), modifier = Modifier.size(24.dp)
            )
            Text(text = "Bookings",
                color = Color(0xFF797977),
                fontSize = 10.sp)
        }
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                contentDescription = "Image 4",
                painter = painterResource(id = R.drawable.four),
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Membership", color = Color(0xFF797977),
                fontSize = 10.sp)
        }
    }
}

@Preview
@Composable
private fun ButtonBarItemPreview() {
    Surface {
        BottomBarItem()
    }
}