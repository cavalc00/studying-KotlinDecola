package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola

import java.util.*

fun main(){

    var scan = Scanner(System.`in`)

    println("Calculo IMC - Desafio 1");

    println("Entre com o peso: ");
    var peso = scan.nextFloat();

    println("Entre com a altura: ");
    var altura = scan.nextFloat();

    var imc = CalculaIMC(peso, altura);
    println(ImprimeIMC(imc));
}

fun CalculaIMC(peso: Float, altura: Float ) = peso/(altura*altura);

fun ImprimeIMC(resultado: Float): String{
    var msg = "";
    when{
        resultado < 18.5f -> msg = "O valor de seu IMC é ${resultado}, você esta no parâmetro de MAGREZA!"   //Para fazer uma comparação booleana no when utilizar deste modo, fica mais legivel
        resultado in 18.5f..24.9f -> msg = "O valor de seu IMC é ${resultado}, você esta no parâmetro IDEAL!" // Aqui podemos procurar o valor em algum range, utilizando (valor)..(valor)
        resultado in 24.9f..30f -> msg = "O valor de seu IMC é ${resultado}, você esta no parâmetro de SOBREPESO!"
        resultado > 30f -> msg = "O valor de seu IMC é ${resultado}, você esta no parâmetro de OBESIDADE!"
    }
    return msg;
}
