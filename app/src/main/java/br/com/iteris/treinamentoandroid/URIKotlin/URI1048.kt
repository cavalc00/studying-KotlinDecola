package br.com.iteris.treinamentoandroid.URIKotlin

fun main() {
    var valor = readLine()?.toDouble() ?: 0.0
    var reajuste: Double

    when{
        valor in 0.0..400.00 -> {
            reajuste = valor*0.15
            valor*=1.15
            println("Novo salario: ${String.format("%.2f", valor)}")
            println("Reajuste ganho: ${String.format("%.2f", reajuste)}")
            println("Em percentual: 15 %")
        }
        valor in 400.01..800.00 -> {
            reajuste = valor*0.12
            valor*=1.12
            println("Novo salario: ${String.format("%.2f", valor)}")
            println("Reajuste ganho: ${String.format("%.2f", reajuste)}")
            println("Em percentual: 12 %")
        }
        valor in 800.01..1200.00 -> {
            reajuste = valor*0.1
            valor*=1.1
            println("Novo salario: ${String.format("%.2f", valor)}")
            println("Reajuste ganho: ${String.format("%.2f", reajuste)}")
            println("Em percentual: 10 %")
        }
        valor in 1200.01..2000.00 -> {
            reajuste = valor*0.07
            valor*=1.07
            println("Novo salario: ${String.format("%.2f", valor)}")
            println("Reajuste ganho: ${String.format("%.2f", reajuste)}")
            println("Em percentual: 7 %")
        }
        valor > 2000.00 -> {
            reajuste = valor*0.04
            valor*=1.04
            println("Novo salario: ${String.format("%.2f", valor)}")
            println("Reajuste ganho: ${String.format("%.2f", reajuste)}")
            println("Em percentual: 4 %")
        }
    }
}

