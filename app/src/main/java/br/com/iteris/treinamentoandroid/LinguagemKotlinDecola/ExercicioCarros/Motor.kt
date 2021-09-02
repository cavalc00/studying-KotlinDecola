package br.com.iteris.treinamentoandroid.LinguagemKotlinDecola.ExercicioCarros

enum class Motor {
    MOTOR10,
    MOTOR16;

    fun selecionaMotor(motor: Motor): String{
        when(motor){
            MOTOR10 -> return "Motor 1.0"
            MOTOR16 -> return "Motor 1.6"
        }
    }
}