package com.pjasoft.composefundamentals.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjasoft.composefundamentals.ui.theme.ComposeFUndamentalsTheme

@Composable
fun ProductItem(){
    Box(
        modifier = Modifier
            .padding(10.dp)
            .width(150.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Red)
    ) {
        // Imagen

        //
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(
                        vertical = 5.dp,
                        horizontal = 10.dp
                    )
            )
            {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "rating",
                    tint = Color(0xFFFAAC73)
                )
                Text(
                    text = "4.4"
                )
            }
            
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "like",
                tint = Color.Red,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(5.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter)
                .padding(10.dp)
        ) {
            Text(
                text = "Producto 1"
            )
            Text(
                text = "$15.00"
            )
        }
    }
}

@Preview()
@Composable
fun ProductItemPreview(){
    ComposeFUndamentalsTheme {
        ProductItem()
    }
}