package com.example.introkotlin_901.temasKotlin
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Ingrese el valor de a: ")
    val a = readLine()?.toDoubleOrNull()
    print("Ingrese el valor de b: ")
    val b = readLine()?.toDoubleOrNull()
    print("Ingrese el valor de c: ")
    val c = readLine()?.toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Error: Los coeficientes deben ser números validos")
        return
    }

    if (a == 0.0) {
        println("Error: 'a' no puede ser cero en una ecuacion cuadratica")
        return
    }

    val discriminante = b.pow(2) - 4 * a * c

    when {
        discriminante > 0 -> {
            val x1 = (-b + sqrt(discriminante)) / (2 * a)
            val x2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Soluciones reales diferentes:")
            println("x1 = %.2f".format(x1))
            println("x2 = %.2f".format(x2))
        }
        discriminante == 0.0 -> {
            val x = -b / (2 * a)
            println("Solucion real única:")
            println("x = %.2f".format(x))
        }
        else -> {
            val parteReal = -b / (2 * a)
            val parteImaginaria = sqrt(-discriminante) / (2 * a)
            println("Soluciones:")
            println("x1 = %.2f + %.2fi".format(parteReal, parteImaginaria))
            println("x2 = %.2f - %.2fi".format(parteReal, parteImaginaria))
        }
    }
}