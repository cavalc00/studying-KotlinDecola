package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

import com.google.gson.Gson
import java.util.*
import kotlin.system.exitProcess

fun main() {
    Init()
}

private fun Init() {
    val scan = Scanner(System.`in`)
    var continuar = true
    var op: Int
    val pedido: MutableList<Prato> = mutableListOf()
    var pratoTemp: Prato?

    while (continuar) {
        println("---------------------------")
        println("Escolha uma refeição:")
        println("1 - Picanha")
        println("2 - Alcatra")
        println("3 - Pernil")
        println("0 - Sair")
        println("---------------------------")
        print("Escolha: ")

        op = scan.nextInt()
        pratoTemp = SelecionarPrato(op)

        if (pratoTemp != null) {
            println("Gostaria de fazer outro pedido?")
            println("1- Sim")
            println("2 - Não")
            op = scan.nextInt()
            when (op) {
                1 -> pedido.add(pratoTemp)
                2 -> {
                    pedido.add(pratoTemp)
                    continuar = false
                }
                else -> {
                    println("Opção inválida, fechando a conta...")
                }
            }
        }
    }
    FecharConta(pedido)
    PreencherFicha()
}

private fun SelecionarPrato(op: Int): Prato? {
    var prato: Prato? = null
    val scanner = Scanner(System.`in`)
    var op2 = op

    when (op2) {
        1 -> prato = Picanha()
        2 -> prato = Alcatra()
        3 -> prato = Pernil()
        0 -> exitProcess(0)
        else -> {
            println("Opção inválida, tente novamente...")
            println("---------------------------")
            Init()
        }
    }

    EscolherAcompanhamento(prato)

    println("---------------------------")
    println("Descrição: ${prato?.getDescricao()}")
    println("Acompanhamento: ${prato?.acompanhamento}")
    println("Valor: R$${prato?.getValorPrato()}")
    println("---------------------------")
    println("Gostaria de comer esse prato?")
    println("1 - Sim")
    println("2 - Não")
    println("---------------------------")
    print("Escolha: ")

    op2 = scanner.nextInt()
    when (op2) {
        1 -> {
            prato?.Comer()
            println("---------------------------")
        }
        2 -> {
            prato = null
            println("Voltando para o menu...")
            Init()
            exitProcess(0)
        }
        else -> {
            println("---------------------------")
            println("Opção inválida...")
            SelecionarPrato(op)
        }
    }
    return prato
}

private fun EscolherAcompanhamento(prato: Prato?) {
    val op: Int
    val scanner = Scanner(System.`in`)

    println("Escolha seu acompanhamento:")
    println("1 - Farofa")
    println("2 - Arroz")
    println("3 - Batata")
    println("4 - Sem Acompanhamento")
    println("5 - Selecionar outro prato")

    op = scanner.nextInt()

    when (op) {
        1 -> prato?.getAcompanhamento(op)
        2 -> prato?.getAcompanhamento(op)
        3 -> prato?.getAcompanhamento(op)
        4 -> prato?.getAcompanhamento(op)
        5 -> {
            Init()
            exitProcess(0)
        }
        else -> {
            println("---------------------------")
            println("Opção inválida...")
            return EscolherAcompanhamento(prato)
        }
    }
}

private fun FecharConta(pedido: MutableList<Prato>) {
    var valorTotal: Double = 0.0

    for (i in pedido){
        valorTotal += i.getValorPrato()
    }
    println("---------------------------")
    println("Todos pratos pedidos: ")
    for (i in pedido){
        println("Guarnição: ${i.getDescricao()} | Acompanhamento: ${i.acompanhamento} | Valor: ${i.getValorPrato()}")
    }
    println("Valor Total: R$  $valorTotal")
    println("---------------------------")
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

