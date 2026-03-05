package com.pjasoft.composefundamentals.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjasoft.composefundamentals.ui.theme.ComposeFUndamentalsTheme

@Composable
fun Proporciones(){
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(100.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .weight(3f)
//                .fillMaxHeight()
//                .background(Color.Red)
//        ) { }
//        Box(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxHeight()
//                .background(Color.Cyan)
//        ) { }
//        Box(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxHeight()
//                .background(Color.Yellow)
//        ) { }
//    }
    Column(
        modifier = Modifier
            .width(200.dp)
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Yellow)
        ) { }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Red)
        ) { }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ProporcionesPreview(){
    ComposeFUndamentalsTheme {
        Proporciones()
    }
}