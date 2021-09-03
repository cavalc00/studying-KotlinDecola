package br.com.iteris.treinamentoandroid.URIKotlin

import java.io.*
import java.util.*

fun main() {
    val buffer: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var quantidadeTestes: Int = buffer.readLine().toInt()


    while (quantidadeTestes != 0) {

        var fraseFinal: String = buffer.readLine()
        var somenteLetrasMudando: String = ""
        var fraseNovaInversa: String = ""
        var metadaDaFrase: String = ""
        var mudandoMetadeFrase: String = ""

        for (i in fraseFinal) {
            if (i.isLetter()) { //Mudei todas os caracteres que são letras para 3 posições a frente da tabela ascii
                somenteLetrasMudando += (i + 3)
            } else {
                somenteLetrasMudando += i
            }
        }

        fraseNovaInversa = somenteLetrasMudando.reversed()
        metadaDaFrase =
            fraseNovaInversa.substring(fraseNovaInversa.length / 2) //Substring começando da metade da frase

        for (i in metadaDaFrase) { //Aqui mudo todos os caracteres da metade da frase nova para uma posição atrás da tabela ascii
            mudandoMetadeFrase += i - 1
        }

        fraseNovaInversa = fraseNovaInversa.substring(
            0,
            fraseNovaInversa.length / 2
        ) //Substring começando do index 0 e indo até a metade de seu tamanho

        println(fraseNovaInversa + mudandoMetadeFrase)
        quantidadeTestes--
    }
}
