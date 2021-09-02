package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

class Picanha: Prato(Acompanhamentos.FAROFA) {
    override fun getAcompanhamento(): String = acompanhamentos.EscoherAcompanhamento(Acompanhamentos.FAROFA)
    override fun getDescricao(): String = "Picanha com acompanhamento de farofa."
    override fun getValorPrato(): Double = 65.00  //<<<PERGUNTAR SOBRE ESSE ESQUEMA AQUI

    override fun Comer() {
        println("Comendo picanha com acompanhamento de farofa.")
    }
}