package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    println("Calculo de sálario")
    println("Informe o número do funcionário:")
    val numero = scan.nextInt()
    println("Informe o número de horas trabalhadas:")
    val horasTrabalhadas = scan.nextFloat()
    println("Informe o valor das horas:")
    val valor = scan.nextFloat()

    val vinicius = Funcionario(numero, horasTrabalhadas, valor)
    val salarioVinicius = CalcularSalario(vinicius)

    println("O sálario do funcionario ${vinicius.numero} é R$${String.format("%.2f", salarioVinicius.valorCalculado)}")
}

class Funcionario(
    val numero: Int = 0,
    val horasTrabalhadas: Float = 0.0f,
    val valorHora: Float = 0.0f
) //Se a classe não tiver nada no corpo não precisa colocar


class CalcularSalario(functionary: Funcionario?) {  //passando como opcional é como se fosse dois construtores. ex. (functionary: Funcionario? = null)
    private var funcionario: Funcionario? = functionary

    constructor() : this( null )   //Neste caso explicitei o construtor

    init {
        if (this.funcionario != null) CalculoTotal()
        else println("Não foi passado nenhum funcionário para o cálculo!")
    }

    var valorCalculado: Float = 0.0f
        private set;

    private fun CalculoTotal(): Float {
        valorCalculado = (this.funcionario?.valorHora ?: 0.0f) * (this.funcionario?.horasTrabalhadas ?: 0.0f)
        return valorCalculado
    }
}
