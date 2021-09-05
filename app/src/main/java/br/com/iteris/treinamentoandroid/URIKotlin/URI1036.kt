package br.com.iteris.treinamentoandroid.URIKotlin

import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main() {

    val entrada = readLine()?.split(' ')

    if (entrada != null) {
        val a = entrada.get(0).toDouble()
        val b = entrada.get(1).toDouble()
        val c = entrada.get(2).toDouble()
        val delta: Double
        val r1: Double
        val r2: Double

        if (a == 0.0) {
            println("Impossivel calcular")
            exitProcess(0)
        }

        delta = raizDelta(a, b, c)

        if (delta.isNaN()) {
            println("Impossivel calcular")
            exitProcess(0)
        }

        r1 = raizUm(b, delta, a)
        r2 = raizDois(b, delta, a)

        println("R1 = ${String.format("%.5f", r1)}")
        println("R2 = ${String.format("%.5f", r2)}")
    }
}

fun raizDelta(a: Double, b: Double, c: Double): Double {
    var delta: Double = 0.0
    delta = sqrt(b.pow(2.0) - 4 * a * c)
    return delta
}

fun raizUm(b: Double, delta:Double, a: Double): Double {
    return (-b+delta)/(2*a)
}

fun raizDois(b: Double, delta:Double, a: Double): Double {
    return (-b-delta)/(2*a)
}