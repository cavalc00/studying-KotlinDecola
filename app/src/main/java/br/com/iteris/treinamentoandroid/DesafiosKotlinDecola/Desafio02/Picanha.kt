package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

class Picanha: Prato() {
    override fun getDescricao(): String = "Picanha" // se igualar o retorno que a função pede a ela não precisa abrir o corpo do metodo, mas nesse caso so pode ter uma linha
    override fun getValorPrato(): Double = 65.00
    override fun Comer() {
        println("Comendo picanha com acompanhamento de $acompanhamento.")
    }
}