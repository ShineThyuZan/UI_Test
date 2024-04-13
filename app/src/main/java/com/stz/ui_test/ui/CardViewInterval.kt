package com.stz.ui_test.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stz.ui_test.R

@Composable
fun CardViewInterval() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)) {
        // Start component
        Text(
            text = "Spinning Interval",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            modifier = Modifier
                .weight(2f)
                .align(alignment = Alignment.CenterVertically)

        )
        Spacer(modifier = Modifier.weight(2f)) // Pushes content to the ends
        // End component
        Icon(
            modifier = Modifier
                .size(18.dp)
                .align(alignment = Alignment.CenterVertically),
            painter = painterResource(id = R.drawable.gym),
            contentDescription = "gym"
        )
        Text(modifier = Modifier.padding(8.dp),
            text = "Marvin J.",
            fontSize = 12.sp)

    }
}

@Preview
@Composable
fun CardViewIntervalPreview() {
    Surface {
        CardViewInterval()
    }
}
