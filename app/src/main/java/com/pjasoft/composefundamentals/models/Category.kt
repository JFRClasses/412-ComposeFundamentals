package com.pjasoft.composefundamentals.models

//LOGICA DE NEGOCIO
data class Category(
    val id : Int,
    val name : String,
    val image : String
)

val categories = listOf(
    Category(1, "Hamburguesas", "https://plus.unsplash.com/premium_photo-1683619761492-639240d29bb5?q=80&w=387&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
    Category(2, "Pizzas", ""),
    Category(3, "Ensaladas", ""),
    Category(4, "Postres", ""),
    Category(5, "Bebidas", ""),
    Category(6, "Sushi", ""),
    Category(7, "Pastas", ""),
    Category(8, "Tacos", ""),
    Category(9, "Sopas", ""),
    Category(10, "Cortes de Carne", "")
)
