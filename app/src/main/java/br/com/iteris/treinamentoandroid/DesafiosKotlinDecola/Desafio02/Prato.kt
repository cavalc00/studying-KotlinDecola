package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

abstract class Prato(acompanhamentos: Acompanhamentos):Comer{

     var acompanhamentos: Acompanhamentos = acompanhamentos
        private set

    abstract fun getAcompanhamento(): String
    abstract fun getDescricao(): String
    abstract fun getValorPrato(): Double
}