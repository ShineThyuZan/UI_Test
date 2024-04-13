package com.stz.ui_test

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stz.ui_test.ui.BottomBarItem
import com.stz.ui_test.ui.CardViewItem

@Composable
fun CardOverViewItem() {
    Column {
        Box(modifier = Modifier.clip(RoundedCornerShape(24.dp))) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Classes",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .weight(2f)
                            .align(alignment = Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.weight(2f)) // Pushes content to the ends

                    // End Component
                    Button(
                        onClick = { /* Your action here */ },
                        colors = ButtonDefaults.buttonColors(Color(0xff999d26))
                    ) {
                        Row {
                            Text(text = "Today",fontSize = 12.sp)
                            Icon(
                                painter = painterResource(id = R.drawable.ic_down),
                                contentDescription = "down arrow",
                                Modifier.size(18.dp)
                            )
                        }
                    }
                }
                CardViewItem()
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.btn_img),
                    contentDescription = "gymm image",
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}

@Preview
@Composable
private fun CardOverViewItemPreview() {
    Surface {
        CardOverViewItem()
    }
}