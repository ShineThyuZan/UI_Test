package com.stz.ui_test.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
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
import com.stz.ui_test.CardOverViewItem
import com.stz.ui_test.R

@Composable
fun BackgroundContentView() {
    Column (modifier = Modifier.fillMaxSize()){
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Box(modifier = Modifier.fillMaxWidth().height(240.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.bg),
                    contentDescription = "Background image",
                    contentScale = ContentScale.FillWidth
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(bottom = 16.dp)
            ) {
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    Modifier
                        .weight(1f)
                        .height(96.dp)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "12 Jun", color = Color(0xFF6B6B31))
                    Text(text = "Mon", color = Color(0xFF727239))
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    Modifier
                        .weight(1f)
                        .height(96.dp)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color(0xFFBEC39C)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "13 Jun", color = Color(0xFFFAFAF7))
                    Text(text = "Tue", color = Color(0xFFFDFDFC),
                        fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    Modifier
                        .weight(1f)
                        .height(96.dp)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color(0xFFBEC39C)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "14 Jun", color = Color(0xFFFFFFFF))
                    Text(text = "Wed", color = Color(0xFFFFFFFD),
                        fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    Modifier
                        .weight(0.5f)
                        .height(96.dp)
                        .clip(shape = RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp))
                        .background(color = Color(0xFFBEC39C)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "15 J", color = Color(0xFFFFFFFF))
                    Text(text = "Thu", color = Color(0xFFFDFDFB),
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        CardOverViewItem()
    }
}

@Preview
@Composable
private fun BackPreview() {
    Surface {
        BackgroundContentView()
    }
}