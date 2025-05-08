package com.example.introkotlin_901.temasKotlin
import kotlin.math.pow
fun main() {
    var opcion: Int
    do {
        println("\n1. Circulo\n2. Cuadrado\n3. Pentagono\n4. Triangulo\n5. Salir")
        opcion = readLine()?.toIntOrNull() ?: 0

        when(opcion) {
            1 -> { print("Radio: "); println("Area: ${3.1416 * readLine()!!.toDouble().pow(2)}") }
            2 -> { print("Lado: "); println("Area: ${readLine()!!.toDouble().pow(2)}") }
            3 -> { print("Lado: "); val l = readLine()!!.toDouble()
                print("Apotema: "); println("Area: ${2.5 * l * readLine()!!.toDouble()}") }
            4 -> { print("Base: "); val b = readLine()!!.toDouble()
                print("Altura: "); println("Area: ${b * readLine()!!.toDouble() / 2}") }
        }
    } while(opcion != 5)
}