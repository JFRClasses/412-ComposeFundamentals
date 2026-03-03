package com.pjasoft.composefundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.pjasoft.composefundamentals.components.CategoryItem
import com.pjasoft.composefundamentals.models.categories
import com.pjasoft.composefundamentals.ui.theme.ComposeFUndamentalsTheme
// Jetpack COmpose 1 Activity -- Android Views
// Ciclo de Vida --- OnCreate -- onStart  -- OnResume -- OnStop -- OnDestroy
// Funciones
// SwiftUI  -- Flutter -- React -- Angular
// Programacion Declarativa
// Programacion Imperativa
// Composable --- UNA FUNCION @Composable
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFUndamentalsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()
                }
            }
        }
    }
}
// Sobrecarga de metodos
/*
* class Persona{
*
*   fun saludar(){
    *   println("Hola")
    * }
    * fun saludar(nombre:String){
    *   println("Hola soy $nombre")
    * }
    * fun saludar(nombre:String) : String{
    *   println("Hola soy $nombre")
    *   return "Hola soy $nombre"
    * }
* }
*
* */
@Composable
fun MyColumn(){
    // 1. Column --> Acomodar los elementos de arriba hacia abajo
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(all = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hola a tasdasdasdasdodos",
            modifier = Modifier
                .background(Color.Green)
                .padding(20.dp)

        )
        Text(
            text = "Como estan??",
            modifier = Modifier
                .background(Color.Magenta)
                .padding(20.dp),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )
        Text(
            text = "Como estan??",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(20.dp)
        )
    }
}

@Composable
fun MyRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Text(
            text = "Hola",
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Green)
                .padding(20.dp)

        )
        Text(
            text = "Casdasasdasdo??",
            modifier = Modifier
                .background(Color.Magenta)
                .width(100.dp)
                .height(200.dp)
                .padding(20.dp),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )
        Text(
            text = "Como estan??",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(20.dp)
        )
    }
}

@Composable
fun MyBox(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
    ) {
        Text(
            text =  "Hola a todos",
            modifier = Modifier
                .background(Color.Cyan)
                .align(Alignment.Center)
        )
        Text(
            text = "Heey",
            modifier = Modifier
                .background(Color.Red)
                .align(Alignment.BottomStart)
        )
    }
}

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        // Header del Menu con la foto
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Menu",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Red)
            ) {

            }
        }
        // Barra de busqueda --> Composable
        // Callbacks ---> PASAR UNA FUNCION COMO PARAMETRO DE OTRA FUNCION
        OutlinedTextField(
            value = "",
            onValueChange = {  },
            placeholder = {
                Text(
                    text = "Search for anything..."
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp    )
        )

        //Categorias
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(categories){ category ->
                CategoryItem(category)
            }
        }

        Text(
            text = "Today's Deal",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp)
        )
        // Todays deal
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                .background(Color.Red)
        )
        {
            Text(
                text = """
                    Get 
                    FREE COKE 
                    on every burguer""".trimIndent(),
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )
            AsyncImage(
                model = "https://farmaciacalderon.com/cdn/shop/products/75009809_580x.png?v=1605546719",
                contentDescription = "coca",
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(200.dp)
            )
        }

        // Products
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize()
        ) {
            items(categories){ category ->
                CategoryItem(category)
            }
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ComposeFUndamentalsTheme {
        HomeScreen()
    }
}