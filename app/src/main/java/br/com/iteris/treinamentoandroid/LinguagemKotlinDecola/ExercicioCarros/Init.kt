package br.com.iteris.treinamentoandroid.LinguagemKotlinDecola.ExercicioCarros

import java.util.*
import kotlin.system.exitProcess

fun main() {

    val scan = Scanner(System.`in`)
    var modelo: Carro
    var op: Int

    println("Selecione uma opção de veiculo:")
    println("1 - Onix/Chevrolet")
    println("2 - Argo/Fiat")
    println("3 - HB20/Hyundai")
    println("0 - Sair")
    op = scan.nextInt()
    println("-------------------")


    when (op) {
        1 -> modelo = Onix()
        2 -> modelo = FiatArgo()
        3 -> modelo = HB20()
        0 -> exitProcess(0)
        else -> {
            println("Valor Inválido!")
            exitProcess(0)
        }
    }

    InfoCar(modelo)
    println("-------------------")
    println("Gostaria de dirigir o carro?")
    println("1 - SIM")
    println("2 - Não")
    op = scan.nextInt()
    println("-------------------")


    when(op){
        1 -> {
            modelo.Acelera()
            modelo.Freiar()
        }
        2 -> println("Fechou princeso, agora preenche a ficha:")
        else ->{
            println("Opcão inválida")
        }
    }
    println("-------------------")

    preencherFicha()
}

fun InfoCar(modelo: Carro) {
    println("Marca: ${modelo.getMarcaVeiculo()}")
    println("Modelo: ${modelo.getModeloVeiculo()}")
    println("Motor: ${modelo.getMotorVeiculo()}")
    println("Valor: ${modelo.getValorVeiculo()}")
}

fun preencherFicha(){
    val scan = Scanner(System.`in`)
    var nome: String
    var cpf: String

    println("Preencha a ficha cadastral: ")
    println("Nome: ")
    nome = scan.nextLine()
    println("CPF: ")
    cpf = scan.nextLine()

    FichaCadastral(nome, cpf)
}