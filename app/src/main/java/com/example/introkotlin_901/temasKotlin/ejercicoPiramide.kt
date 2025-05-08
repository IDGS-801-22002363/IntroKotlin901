package com.example.introkotlin_901.temasKotlin

fun main() {
    print("Ingrese el numero de niveles para la piramide: ")
    val niveles = readLine()?.toIntOrNull()

    if (niveles == null || niveles <= 0) {
        println("Debe ingresar un numero entero positivo")
        return
    }
    var i = 1
    do {
        var espacios = niveles - i
        var j = 0
        while (j < espacios) {
            print(" ")
            j++
        }
        var k = 0
        while (k < 2 * i - 1) {
            print("*")
            k++
        }
        println()
        i++
    } while (i <= niveles)
}