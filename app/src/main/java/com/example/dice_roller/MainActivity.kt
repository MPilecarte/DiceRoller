package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dice_roller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var Binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button =findViewById(R.id.RollButton)
//   ou  val rollButton:Button = viewBinding(R.id.RollButton)
        rollButton.setOnClickListener { rollDice() }
//        Evento listener executa a função quando o botão for clicado
    }

    fun rollDice(){

        val randomInt = (1..100).random().toString() // converte o random (que é do tipo Int) em uma String para ser exibida na caixa de texto

        val resultText: TextView = findViewById(R.id.RandomNumber)
//     declarando uma variavel de nome 'resultText' com ?classe? TextView e buscando no layout

//       Ou binding.<nome da caixa de text>
        resultText.text= randomInt
//      jogando o texto do layout na variavel 'resultText'

        val Toast = Toast.makeText(this, "Rolou um dado!", Toast.LENGTH_SHORT) //cria a mensagem
        Toast.show() // exibe a mensagem
        resultText.text = resultText.toString()


    }

}