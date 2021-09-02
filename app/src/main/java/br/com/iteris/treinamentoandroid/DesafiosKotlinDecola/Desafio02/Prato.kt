package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

abstract class Prato():Comer {
    var acompanhamento: String? = "Sem acompanhamento"


    fun getAcompanhamento(op: Int) {
        when (op) {
            1 -> acompanhamento = Acompanhamentos.EscoherAcompanhamento(Acompanhamentos.FAROFA)
            2 -> acompanhamento = Acompanhamentos.EscoherAcompanhamento(Acompanhamentos.ARROZ)
            3 -> acompanhamento = Acompanhamentos.EscoherAcompanhamento(Acompanhamentos.BATATA)
            4 -> return
            else -> {
                return println("Opção inválida")
            }
        }
    }

    abstract fun getDescricao(): String
    abstract fun getValorPrato(): Double //Pelo metodo que herda esta classe ser obrigado a implementar esse método ele retornará algo, mas pelo fato de não ter um atributo ele não salva esse valor
}
