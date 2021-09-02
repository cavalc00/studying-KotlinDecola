package br.com.iteris.treinamentoandroid.LinguagemKotlinDecola.ExercicioCarros

abstract class Carro
    (protected var marca: String,
     protected var modelo: String,
     motor : Motor,
     protected var valor: String) : Acelera, Freia
{
        var motor: Motor = motor
        private set

    fun getMarcaVeiculo():String = this.marca
    fun getModeloVeiculo():String = this.modelo
    fun getMotorVeiculo():String = motor.selecionaMotor(motor)
    fun getValorVeiculo():String = this.valor

}