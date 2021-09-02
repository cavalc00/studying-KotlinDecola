package br.com.iteris.treinamentoandroid.AluraKotlin

fun main() {









}

class Conta(){

}


fun TestaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo neutro")
    } else {
        println("Saldo negativo")
    }

    when { //when é muito semelhante ao switch de outras linguagens, esse codigo faz a mesma coisa que o if acima
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}

fun TestaLoops() {

    for (i in 1..5) { //Em kotlin o for só funciona com coleções a sintaxe padrão não é utilizada
        println(i)   //imprime 1 ao 5
    }

    println("--------------------------")

    for (i in 5 downTo 1){ //Downto é o processo inverso do ..
        println(i)
    }

    println("--------------------------")

    for (i in 1..10 step 2){ //step é para contar confome o valor passado
        println(i)
    }

    println("--------------------------")

    for (i in 1..20 step 2){
        if(i > 10){ //Se caso quiser parar em um valor especifico usar o if, BREAK E CONTINUE funcionam de forma igual as outras linguagens
            break
        }
        println(i)
    }

    println("--------------------------")

    for (i in 1 until 5) //Além do downTo, o Kotlin fornece o until, que exclui o último valor da iteração. Porém, ele funciona apenas para range crescente.
    {
        println(i)
    }

    println("--------------------------")

    var i = 0
    while (i < 10){ //While e Do While, funcionam igual ao costume de outras linguagens
        println(i)
        i++
    }

    println("--------------------------")


}