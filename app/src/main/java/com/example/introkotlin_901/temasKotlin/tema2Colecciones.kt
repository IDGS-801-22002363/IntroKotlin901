package com.example.introkotlin_901.temasKotlin
/*
fun main() {
    /*
    List, MutableList
    Set, MutableSet
    Map, MutableMap
    */

    var readOnlyList: List:<String> = listof("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println(readOnlyList)
    println("el primer dia es ${readOnlyList[0]}")
    println("el primer dia es ${readOnlyList.first()}")
    println("el numero de dia es ${readOnlyList.count()}")
    println("el numero de dia es ${readOnlyList.size}")
    println("Martes" In readOnlylist)
    var figuras: MutableList<String>= mutableListof ("circulo", "Cuadado", "Triangulo")
    println(figuras)

    figuras.add("Pentagono")
    println(figuras)
    figuras.removeAt(0)
    println(figuras)
    figuras.remove("cuadrado")
    -----------------------------
    val readOnlyFrutas = mapOf("manzana" to 1500, "plátano" to 2000, "samdia" to 2500)
    println(readOnlyFrutas)
    println(readOnlyFrutas["manzana"])
    println(readOnlyFrutas.keys)
    println(readOnlyFrutas.values)

}*/