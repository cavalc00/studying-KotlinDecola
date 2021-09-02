package br.com.iteris.treinamentoandroid.LinguagemKotlinDecola.ExercicioCarros

class HB20: Carro("Hyundai", "HB20", Motor.MOTOR16, "R$65.000,00"){
    override fun Acelera() {
        println("Acelerando HB20...")
    }

    override fun Freiar() {
        println("Freiando HB20...")
    }
}
class FiatArgo: Carro("Fiat ", "Argo", Motor.MOTOR16, "R$70.000,00"){
    override fun Acelera() {
        println("Acelerando Fiat Argo...")
    }

    override fun Freiar() {
        println("Freiando Fiat Argo...")
    }
}
class Onix: Carro("Chevrolet", "Onix", Motor.MOTOR10, "R$60.000,00"){
    override fun Acelera() {
        println("Acelerando Onix...")
    }

    override fun Freiar() {
        println("Freiando Onix...")
    }
}