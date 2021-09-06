package br.com.iteris.treinamentoandroid.URIKotlin

fun main() {
    var entrada = readLine()?.toDouble()

    val arrNotas: IntArray = IntArray(6)
    val arrMoedas: IntArray = IntArray(6)

    if (entrada != null) {
        while (entrada != 0.00) {
            when {
                entrada % 100.00 == 0.00 -> {
                    entrada -= 100
                    arrNotas[0] += 1
                }
                entrada % 50.00 == 0.00 -> {
                    entrada -= 50
                    arrNotas[1] += 1
                }
                entrada % 20.00 == 0.00 -> {
                    entrada -= 20
                    arrNotas[2] += 1
                }
                entrada % 10.00 == 0.00 -> {
                    entrada -= 10
                    arrNotas[3] += 1
                }
                entrada % 5.00 == 0.00 -> {
                    entrada -= 5
                    arrNotas[4] += 1
                }
                entrada % 2.00 == 0.00 -> {
                    entrada -= 2
                    arrNotas[5] += 1
                }
                entrada % 1.00 == 0.00 -> {
                    entrada -= 1.00
                    arrMoedas[0] += 1
                }
                entrada % 0.50 == 0.00 -> {
                    entrada -= 0.50
                    arrMoedas[1] += 1
                }
                entrada % 0.25 == 0.00 -> {
                    entrada -= 0.25
                    arrMoedas[2] += 1
                }
                entrada % 0.10 == 0.00 -> {
                    entrada -= 0.10
                    arrMoedas[3] += 1
                }
                entrada % 0.05 == 0.00 -> {
                    entrada -= 0.05
                    arrMoedas[4] += 1
                }
                entrada % 0.01 == 0.00 -> {
                    entrada -= 0.01
                    arrMoedas[5] += 1
                }
            }
        }
        println("NOTAS:")
        println("${arrNotas[0]} nota(s) de R$ 100.00")
        println("${arrNotas[1]} nota(s) de R$ 50.00")
        println("${arrNotas[2]} nota(s) de R$ 20.00")
        println("${arrNotas[3]} nota(s) de R$ 10.00")
        println("${arrNotas[4]} nota(s) de R$ 5.00")
        println("${arrNotas[5]} nota(s) de R$ 2.00")
        println("MOEDAS:")
        println("${arrMoedas[0]} moeda(s) de R$ 1.00")
        println("${arrMoedas[1]} moeda(s) de R$ 0.50")
        println("${arrMoedas[2]} moeda(s) de R$ 0.25")
        println("${arrMoedas[3]} moeda(s) de R$ 0.10")
        println("${arrMoedas[4]} moeda(s) de R$ 0.05")
        println("${arrMoedas[5]} moeda(s) de R$ 0.01")
    }
}