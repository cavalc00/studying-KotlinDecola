package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

abstract class Prato(acompanhamentos: Acompanhamentos):Comer{

     var acompanhamentos: Acompanhamentos = acompanhamentos
        private set

     fun getAcompanhamento(): String{
        return acompanhamentos.EscoherAcompanhamento(acompanhamentos)
     }

    abstract fun getDescricao(): String
    abstract fun getValorPrato(): Double //Pelo metodo que herda esta classe ser obrigado a implementar esse método ele retornará algo, mas pelo fato de não ter um atributo ele não salva esse valor
}