package br.com.iteris.treinamentoandroid.DesafiosKotlinDecola.Desafio02

enum class Acompanhamentos {
    FAROFA,
    ARROZ,
    BATATA;


        fun EscoherAcompanhamento(acompanhamentos: Acompanhamentos): String {
            when (acompanhamentos) {
                FAROFA -> return "Farofa"
                ARROZ -> return "Arroz"
                BATATA -> return "Batata"
            }
        }
}
