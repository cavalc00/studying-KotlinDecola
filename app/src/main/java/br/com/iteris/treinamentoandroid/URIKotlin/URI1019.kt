package br.com.iteris.treinamentoandroid.URIKotlin

import java.util.*


fun main() {

    var entrada = readLine()?.toInt() ?: 0

    var segundos = 0
    var minutos = 0
    var horas = 0

    while(entrada > 0){
        segundos++
        entrada = entrada.minus(1)
        if (segundos == 60){
            minutos++
            segundos = 0
            }
            if(minutos == 60){
            minutos = 0
            horas++
        }
    }

    println("$horas:$minutos:$segundos")
}