package com.pjasoft.composefundamentals.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pjasoft.composefundamentals.models.Category

@Composable
fun CategoryItem(category: Category){
    Column(
        modifier = Modifier
            .width(100.dp)
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        // Box
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color.Red)
        ) {
            AsyncImage(
                model = category.image,
                contentDescription = category.name,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .align(Alignment.Center),
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = category.name,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}