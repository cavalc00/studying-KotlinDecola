package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

class Pernil: Prato() {
    override fun getDescricao(): String = "Pernil."
    override fun getValorPrato(): Double = 40.00
    override fun Comer() {
        println("Comendo Pernil com acompanhamento de $acompanhamento.")
    }
}