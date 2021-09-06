package br.com.iteris.treinamentoandroid.AndroidDecola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.iteris.treinamentoandroid.R

class NovaActivity : AppCompatActivity() {

    private var textViewHello: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova)
        textViewHello = findViewById(R.id.tvHello) //Binding da nova activity com uma variavel criada dentro da classe NovaActivity, agora com essa variavel posso alterar o layout da classe por aqui tbm

        val vindaDeOutra = intent.getStringExtra("nome") //Aqui capturo o que a outra Activity mandou e coloco em uma variavel

        textViewHello?.setOnClickListener {
            textViewHello?.text = vindaDeOutra //Aqui se o usuario clicar em cima do text ira aparecer a mensagem que estava na variavel capturada da acticity anterior
        }
    }
}
