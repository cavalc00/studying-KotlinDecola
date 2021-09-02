package br.com.iteris.treinamentoandroid.LinguagemKotlinDecola

import java.util.*

//Data class
//É uma classe usada para armazenamento de dados, que não permite herança e comportamentos (métodos). É indicado para uso de classe de parser de retorno de serviço e armazenamento.
//resumindo, usa no consumo de apis

data class Login(   //não usa chave, somente parenteses
    var user: String,
    var pass: String?,
    var data: Date = Date()
)

//Companion Object
//É usado quando queremos declarar atributos ou métodos de uma classe de maneira estática e que possa ser acessada de qualquer ponto do código.

class Carro(modelo: String, marca: String){

    companion object{ //tudo que esta aqui dentro vira estatico, se instanciar um objeto com esse tipo, não tera acessa a variaveis estaticas e metodos
        val MOTOR10 = "1.0"
        val MOTOR14 = "1.4"
        val MOTOR16 = "1.6"
        val MOTOR20 = "2.0"

        fun calculaPotenciaMotor(tipo: String) : String {
            if(tipo == MOTOR10) return "86 CV"
            if(tipo == MOTOR14) return "115 CV"
            if(tipo == MOTOR16) return "132 CV"
            if(tipo == MOTOR20) return "150 CV"
            return "N/A"
        }

    }

}

//Object
//É a maneira simplificada de criar um Singleton(Um Design Pattern do kotlin, pesquisar sobre) dentro do Kotlin, basicamente um objeto que é estático e são visíveis em qualquer ponto do código.
// *Object não tem construtor

object Motor{
    val MOTOR10 = "1.0"
    val MOTOR14 = "1.4"
    val MOTOR16 = "1.6"
    val MOTOR20 = "2.0"

    fun calculaPotenciaMotor(tipo: String) : String {
        if(tipo == MOTOR10) return "86 CV"
        if(tipo == MOTOR14) return "115 CV"
        if(tipo == MOTOR16) return "132 CV"
        if(tipo == MOTOR20) return "150 CV"
        return "N/A"
    }
}

// Enumerador
//Comumente chamado de enum, é uma estrutura de tipagem, no qual define de maneira bem especifica os tipos de valores que determinado objeto deve ter.
///*É uma boa prática, pois limita as variações de uma variável e limita o numero de validações

enum class MotorEnum{
    MOTOR_10,                       //para acessar estes eunumeradores é pela propria classe, não por sua instancia
    MOTOR_14,
    MOTOR_16,
    MOTOR_20;
    // método
    fun calcularPotenciaMotor() : String {  // para chamar esse metodo, necessariamente precisamos criar um objeto deste tipo
        when(this){
            MOTOR_10 -> return "86 cv"
            MOTOR_14 -> return "115 cv"
            MOTOR_16 -> return "132 cv"
            MOTOR_20 -> return "150 cv"
        }
    }
}

class CarroComEnum(){
    private var motor:MotorEnum = MotorEnum.MOTOR_10

    fun getMotor() = motor
    fun setMotor(motor: MotorEnum) {
        this.motor = motor
    }
}

//Extensions
//É a possibilidade de adicionar um métodos a qualquer classe que desejar, mesmo se ela seja fechada, como por exemplo String. Esses métodos são declarados fora de classe de referencia.

fun String.getPrimeiroNome() : String{  //é uma forma de adicionar mais funcionalidades as classes já existentes em kotlin
    return this.split(' ' )[0] //Aqui criei uma função para recuperar a primeira palavra de uma frase, neste caso adicionei a funcionalidade na classe String
}                                          //Pesquisar o que exatamente para onde o this referencia



//Interfaces
//As intefaces no Kotlin permitem também você adicionar atributos e métodos implementados além dos que são obrigatórios a serem implementados. Interfaces não suportam construtor.
interface Freiar {
    var tipoDePastilha: String
    fun freiar()
    fun tipoDeFreio(): String = "ABS"
}

//Classe abstrata
//As classes abstratas não podem ser implementadas, porém podem possuir tudo o que uma interface tem, mais herança e construtor.
abstract class Chassi(protected var chassiCarro: String){

     abstract fun getLarguraChassi() //Métodos obrigados a serem sobre escritos

     fun caculaResistenciaDoChassi(){  //Método herdado. Caso colocar o Open na frente pode ser sobreescrito na classe que herdar esta classe

    }

}

class carro2(): Chassi("sdfsdfs") {
    override fun getLarguraChassi() {

    }

}

fun main(){

    //println(Carro.calculaPotenciaMotor(Carro.MOTOR16)) //chamada de metodos e atributos estaticos é feito via chamada da classe


//    val carro = CarroComEnum()
//
//    carro.setMotor(MotorEnum.MOTOR_20)
//
//    println(carro.getMotor().calcularPotenciaMotor())
//

//    var nome = "Vinicius Cavalcante Rosa"
//    println(nome.getPrimeiroNome())



}

