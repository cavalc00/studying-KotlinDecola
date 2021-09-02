package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

import com.google.gson.Gson
import java.util.*
import kotlin.system.exitProcess

fun main(){
    val scan = Scanner(System.`in`)
    var continuar = true
    var op: Int

    while(continuar){
        println("Escolha uma refeição:")
        println("1 - Picanha")
        println("2 - Alcatra")
        println("3 - Pernil")
        println("0 - Sair")
        println("---------------------------")
        print("Escolha: ")

        op = scan.nextInt()
        InfoPratos(op)
        println("Gostaria de fazer outro pedido?")
        println("1- Sim")
        println("2 - Não")
        op = scan.nextInt()
        if(op == 2) continuar = false
    }
    PreencherFicha()
}

private fun InfoPratos(op: Int){
    val prato: Prato
    val scanner = Scanner(System.`in`)
    var op2 = op

    when(op2){
        1 -> prato = Picanha()
        2 -> prato = Alcatra()
        3 -> prato = Pernil()
        0 -> exitProcess(0)
        else -> {
            println("Opção inválida, encerrando...")
            exitProcess(0)
        }
    }

    println("---------------------------")
    println("Descrição: ${prato.getDescricao()}")
    println("Acompanhamento: ${prato.getAcompanhamento()}")
    println("Valor: ${prato.getValorPrato()}")
    println("---------------------------")
    println("Gostaria de comer esse prato?")
    println("1 - Sim")
    println("2 - Não")
    println("---------------------------")
    print("Escolha: ")

    op2 = scanner.nextInt()
    when(op2){
        1 -> {
            prato.Comer()
            println("---------------------------")
        }
        2 -> return;
        else -> {
            println("Opção inválida, encerrando...")
            exitProcess(0)
        }
    }
}

private fun PreencherFicha(){
    val scan = Scanner(System.`in`)
    val infoCliente: FichaCadastral
    val nome: String
    val cpf: String
    val sugestao: String

    println("Ficha Cadastral:")
    println("Escreva seu nome: ")
    nome = scan.nextLine()
    println("Escreva seu CPF:")
    cpf = scan.nextLine()
    println("Escreva sua Sugestão:")
    sugestao = scan.nextLine()

    infoCliente = FichaCadastral(nome, cpf, sugestao)
    val testeGson = Gson()
    println("---------------------------")
    println(testeGson.toJson(infoCliente))
    println("Dados cadastrados, obrigado!")
    println("---------------------------")
}