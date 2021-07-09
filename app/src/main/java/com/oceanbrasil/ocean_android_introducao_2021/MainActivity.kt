/*
Programa básico em Kotlin - informar nome e sobrenome - limpar tela - abrir outra tela
 */

package com.oceanbrasil.ocean_android_introducao_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_INFO = "EXTRA_INFO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)
        val btLimpar = findViewById<Button>(R.id.btLimpar)
        val etSobrenome = findViewById<EditText>(R.id.etSobrenome)
        val btNovaTela = findViewById<Button>(R.id.btNovaTela)

        btEnviar.setOnClickListener {
            tvResultado.text = etNome.text.toString()
            tvResultado.append(" ")
            tvResultado.append(etSobrenome.text.toString())
        }

        btLimpar.setOnClickListener {
            //etNome.text.clear()
            etSobrenome.text.clear()
            tvResultado.setText(R.string.tvResultado)
            etNome.setText("")
           // etNome.text=null
           // todas limpam, mas o valor null pode afetar o programa
        }

        btNovaTela .setOnClickListener {
            val novaTelaIntent = Intent(this,SecondActivity::class.java)
            novaTelaIntent.putExtra("Texto", etNome.text.toString())
            startActivity(novaTelaIntent)
        }

   }

}