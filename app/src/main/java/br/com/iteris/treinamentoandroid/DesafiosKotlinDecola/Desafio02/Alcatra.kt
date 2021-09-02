package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

class Alcatra:Prato(Acompanhamentos.ARROZ) {
    override fun getDescricao(): String = "Alcatra com acompanhamento de arroz"
    override fun getValorPrato(): Double { //assim da no mesmo do que esta na função acima
        return 55.00
    }
    override fun Comer() {
        println("Comendo alcatra com acompanhamento de arroz.")
    }
}