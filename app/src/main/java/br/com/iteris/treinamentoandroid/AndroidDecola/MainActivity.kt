package br.com.iteris.treinamentoandroid.AndroidDecola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.iteris.treinamentoandroid.R

class MainActivity : AppCompatActivity() {

    private var tvPrincipal: TextView? = null   //Perguntar pq já não pode setar a variavel aqui que crasha

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.llFragment, Primeiro_Fragment()).commit() //Aqui declaro um fragment dentro da minha Activity e o adiciono nela(Um fragment é uma parte da activity, não existe sem ela)
        tvPrincipal = findViewById(R.id.tvPrincipal) //Binding do component de textview de id tvPrincipal criado no XML da classe mainActivity

        val extra = tvPrincipal?.text?.toString() //Guarda o retorno do toString em uma variavel para enviar para outra activity

        supportFragmentManager.beginTransaction().replace(R.id.llFragment, Primeiro_Fragment()).addToBackStack(null).commit() //*Para ter o botão back funcionando e desempilhar seus fragments é importante adicionar na sua transferencia o .addToBackStack(null)

        tvPrincipal?.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.llFragment, NovoFragment()).addToBackStack(null).commit() //Aqui chamo o novoFragment e empilho ele em cima do anterior

            //val intent = Intent(this, NovaActivity::class.java) //Para instanciar Activitys atraves de outra é necessario instanciar um objeto do tipo intent. //Pergunta da notação do java
            //intent.putExtra("nome", extra) //Aqui estou enviando para a Activity que ira vir a variavel que ira como nome e seu conteudo sera o extra (VARIAVEL DO TIPO CHAVE/VALOR)
            //startActivity(intent) //Aqui inicio a proxima Activity passando como argumento a intent instanciada acima
            //tvPrincipal?.text = "Cliquei aqui e funcionou" //Aqui estou mudando o texto do component assim que clicado pelo usuario
        }
    }
}