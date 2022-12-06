package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dice_roller.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//   ou  val rollButton:Button = viewBinding(R.id.RollButton)
        RollButton.setOnClickListener { rollDice() }
//        Evento listener executa a função quando o botão for clicado
    }

    private fun rollDice(){

        var randomNumber = (1..6).random() // converte o random (que é do tipo Int) em uma String para ser exibida na caixa de texto
        val imageDice: Int

        when (randomNumber) {
            1 -> {
                imageDice = R.drawable.dice_1
            }
            2 -> {
                imageDice = R.drawable.dice_2
            }
            3 -> {
                imageDice = R.drawable.dice_3
            }
            4 -> {
                imageDice = R.drawable.dice_4
            }
            5 -> {
                imageDice = R.drawable.dice_5
            }
            else -> {
                imageDice = R.drawable.dice_6
            }
        }
        imageData.setImageResource(imageDice)


//        val resultText: TextView = findViewById(R.id.RandomNumber)
//     declarando uma variavel de nome 'resultText' com ?classe? TextView e buscando no layout

//       Ou binding.<nome da caixa de text>
//       resultText.text= randomInt
//      jogando o texto do layout na variavel 'resultText'

        val Toast = Toast.makeText(this, "Rolou um dado!", Toast.LENGTH_SHORT) //cria a mensagem
        Toast.show() // exibe a mensagem
//        resultText.text = resultText.toString()


    }

}