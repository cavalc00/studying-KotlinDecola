package br.com.iteris.treinamentoandroid.LinguagemKotlinDecola

import java.util.*

fun main() {
//    val ex1 =
//        exemplos() //Criação de classe em kotlin não precisa da palavra new, basta colocar o nome e parenteses no final
//
//    println(ex1.processaDados())
    val scan = Scanner(System.`in`)
    println("Entre com o valor para calcular áreas:")
    println("Valor A:")
    val valorA: Float = scan.nextFloat()
    println("Valor B:")
    val valorB: Float = scan.nextFloat()

    val areas = CalculaArea(valorA, valorB)
}

class CalculaArea(private var valorA: Float, private var valorB: Float){

    init {
        Calculos()
    }

    private var areaRetangulo: Float = 0.0f
    private var areaQuadrado: Float = 0.0f
    private var areaTriangulo: Float = 0.0f

     fun Calculos(){
        areaTriangulo = (valorA * valorB)/2
        println("Area do Triangulo: $areaTriangulo")
        areaQuadrado = (valorB * valorB)
        println("Area do Quadrado: $areaQuadrado")
        areaRetangulo = (valorA * valorB)
        println("Area do Retangulo: $areaRetangulo")
    }
}


class exemplos {

    private var conecta: String? =
        null //Adicionar ? na frente do tipo da variavel significa que ela aceita nulo, ou seja, é uma variavel opcional

    val bar: String by lazy {  //Adicionar o by lazy após a declaração da variavel serve para iniciar o atributo de forma personalizada e somente inicializa assim que chamar o atributo
        val msg = "Estou criando o bar"
        msg //Esta última linha é o que retorna para variavel de nome bar. Não necessita da palavra return
    }

    lateinit var cuidado: String //É usado quando você não quer deixar um atributo como opcional e também não quer que ele seja iniciado no construtor. Deve-se ter muito cuidado ao manusear variáveis com lainit, pois a chamada incorreta delas pode dar NullPointerException.

    var getConexao = conecta ?: "Sem conexão" //?: Elvis operator. É usado em caso que você precisa pegar o valor de uma variável opcional e não quer pegar o valor nulo caso ele seja nulo
    //No caso a variavel conecta for nula, ela passara a string "Sem conexão". Se estiver populada passara o valor que tem dentro da variavel


    //Expressões lambda: É usado quando você quer passar uma função por parâmetro dentro de outra função com a ideia de chamada de retorno, sem a necessidade dos famosos callbacks (implementação de interface e lógica). Também pode ser usado como atributos de uma classe.

    val somatoria: ((Int, Int)/*parametros de chamada*/ -> Int/*parametro de retorno*/) =
        //Aqui foi usado como um parametro de classe
        { //Neste caso a expressao lambda esta sendo usada como atributo de classe
                num1, num2/*parametros de chamada*/ ->
            num1 + num2/*parametro de retorno*/
        }

    fun processaDados() {
        var nome = "Vinicius"
        registraConexao(nome, {
            println("$nome $it")
        })
    }

    //
    fun registraConexao(
        conexao: String,
        onFinish: ((Int) -> Unit)
    ) { //Aqui a expressao foi usada como callback. o Retorno unit é o void
        val resposta: Int = 3
        onFinish(resposta)
    }

}

class Carro1(chassi: String) { //O construtor principal é colocado entre parentes logo após a declaração do nome da classe.

    init { //O método init é chamado pós construtor, quando é desejável adicionar um comportamento na inicialização da classe.
        setModeloMarca()
    }

    //Atributos
    private var chassi: String = chassi
    private var renavam: String = "7458"
    private var modelo: String = "Argo"
    private var marca: String = "Fiat"

    //Metodos
    fun getChassi(): String = chassi
    fun getModeloMarca() = "$modelo $marca"

    fun setModeloMarca() {
        var modeloMarca = "$modelo $marca"
    }
}

class Carro2 { //Também é possível ter N construtores no Kotlin, assim como em outras linguagens. Para esse tipos de multi-construtores, pode-se usar o construtor principal com recebendo os atributos e deixando eles com valor default ou criando construtores secundários como é o caso a baixo:
    //Atributos
    private var chassi: String
    private var renavam: String
    private var modelo: String
    private var marca: String

    //Construtor secundário
    constructor(chassi: String, renavam: String, modelo: String, marca: String) {
        this.chassi = chassi
        this.renavam = renavam
        this.modelo = modelo
        this.marca = marca
    }

    //Metodos
    fun getChassi(): String = chassi
    fun getModeloMarca() = "$modelo $marca"
}

class Carro3(
    private var chassi: String,   //É possível no kotlin reduzir a sintaxe de declaração atributo e construtor, indicando tudo numa única linha dentro do construtor principal, como mostra a baixo:
    private var renavam: String,
    private var modelo: String,
    private var marca: String
) {
    //Metodos
    fun getChassi(): String = chassi
    fun getModeloMarca() = "$modelo $marca"
}

//
//Classe:
//Toda classe por default é final, ou não pode ser herdada. A anotação open permite ela ser herdada.
//
//Método:
//Todo método por default é final, ou não ser sobre escrita. A anotação open permite ela ser sobre escrita.

//Ao contrário de outras linguagens o Kotlin permite você fazer sets e gets direto na variável, tirando assim a necessidade de criar métodos de get e sets como acontece no Java.
//Private set é colocado para impedir que acessos externos modifiquem a variável. Nesse caso somente a própria classe pode alterar a variável.
//
//No exemplo a baixo o Marca e modelo só pode ser setado internamente e externamente ele é visivél mas não pode ser alterado:


class Carro4(modelo: String, marca: String) {
    //Atributos
    private var modelo: String = modelo
    var marca: String = marca
        set(value) {
            marca = value
            modeloMarca = "$modelo $marca"
        }
    var modeloMarca: String = ""
        private set
        get() = "$modelo $marca"
}

