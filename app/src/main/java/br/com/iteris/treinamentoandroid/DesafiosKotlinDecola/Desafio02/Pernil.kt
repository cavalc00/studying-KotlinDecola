package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

class Pernil: Prato(Acompanhamentos.BATATA) {
    override fun getDescricao(): String = "Pernil com acompanhamento de batata."
    override fun getValorPrato(): Double = 40.00
    override fun Comer() {
        println("Pernil com acompanhamento de batata.")
    }

}