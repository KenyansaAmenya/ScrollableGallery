package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScrollableGalleryScreen(){
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())) {
        repeat(10) {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
                ){
                repeat(2) {
                    GalleryCell()
                }
            }
        }

    }
}



@Composable
fun GalleryCell() {
    Card (
        elevation = 16.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Box (
            modifier = Modifier
                .requiredSize(180.dp, 180.dp)
                .padding(8.dp)
        ){
            Image(painter = painterResource(id = R.drawable.greeksalad), 
                contentDescription = "Greek Salad",
                )
            Text(
                text = "Greek Salad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(4.dp)
                    .align(Alignment.TopStart)
                )
            Text(
                text = "Greek Salad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(4.dp)
                    .align(Alignment.BottomEnd)
            )
        }

    }
}