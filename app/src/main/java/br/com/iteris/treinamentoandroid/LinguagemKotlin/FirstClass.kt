package br.com.iteris.treinamentoandroid.LinguagemKotlin

import java.util.*

fun main(){ //main permite criar programas para rodarem no terminal
    println("Entre com o primeiro valor: ")
    var scan = Scanner(System.`in`) //var é uma variavel mutavel, pode ser alterada após setar o valor
    val valor1 = scan.nextInt()  //val é uma constante, não pode ser alterado após setar o valor

    println("Entre com o segundo valor: ")
    val valor2 = scan.nextInt()

    println("Entre com o terceiro valor: ")
    val valor3 = scan.nextInt()

    val soma = calcularSoma(valor1, valor2, valor3)
    val subtracao = calcularSubtracao(valor1, valor2, valor3)

    println("Soma = $soma")
    println("Subtração = $subtracao")

}

fun calcularSoma(num1: Int = 0, num2: Int = 0, num3: Int = 0 ): Int{ //Aqui temos 3 parametros opcionais, já que estão setados com 0
    val soma = num1 + num2 + num3
    return soma
}

fun calcularSubtracao(num1: Int, num2: Int, num3: Int) = num1 - num2 - num3 //Aqui temos 3 parametros obrigatórios, já que nenhum deles tem algum valor padrao setado. Esta também é uma for de encurtar o código, omitindo o tipo de retorno, mas funcional.