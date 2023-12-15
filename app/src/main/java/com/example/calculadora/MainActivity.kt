package com.example.calculadora

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.calculadora.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import java.nio.file.Files.delete

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
  /*  private var calculoAtual = ""
    private var historicoCalculo = ""*/
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       /* val textoLongo = ""
        val tamanhoOriginal = 20f
        val fatorEscala = 0.8f

        val novotamanho = tamanhoOriginal * fatorEscala
        binding.textCalculo.textSize = novotamanho

        binding.textCalculo.text = textoLongo

        with(binding){
            btnUm.setOnClickListener {
                concatenarTexto("1")
            }
            btnDois.setOnClickListener {
                concatenarTexto("2")
            }
            btnTres.setOnClickListener {
                concatenarTexto("3")
            }
            btnQuatro.setOnClickListener {
                concatenarTexto("4")
            }
            btnCinco.setOnClickListener {
                concatenarTexto("5")
            }
            btnSeis.setOnClickListener {
                concatenarTexto("6")
            }
            btnSete.setOnClickListener {
                concatenarTexto("7")
            }
            btnOito.setOnClickListener {
                concatenarTexto("8")
            }
            btnNove.setOnClickListener {
                concatenarTexto("9")
            }
            btnZero.setOnClickListener {
                concatenarTexto("0")
            }
            btnAdicao.setOnClickListener {
                concatenarTexto("+")
            }
            btnSubtracao.setOnClickListener {
                concatenarTexto("-")
            }
            btnMutlplicacao.setOnClickListener {
                concatenarTexto("*")
            }
            btnDivisao.setOnClickListener {
                concatenarTexto("/")
            }
            btnDeletar.setOnClickListener {
                calculoAtual = ""
                historicoCalculo = textCalculo.text.dropLast(1).toString()
                binding.textCalculo.text = historicoCalculo
            }
            btnCE.setOnClickListener {
                calculoAtual = ""
                historicoCalculo = ""
                binding.textResultado.text = historicoCalculo
                binding.textCalculo.text = historicoCalculo
            }
            btnIgual.setOnClickListener {
                val resultado = avaliarExpressao(calculoAtual)
                if (resultado.isNaN()){
                    binding.textResultado.text = "Expressão ivalida"
                }else{
                    binding.textResultado.text = resultado.toString()
                }
            }
        }*/

        val calculo = binding.textCalculo
        with(binding){
            btnUm.setOnClickListener {
                calculo.text = "${calculo.text}1"
            }
            btnDois.setOnClickListener {
                calculo.text = "${calculo.text}2"
            }
            btnTres.setOnClickListener {
                calculo.text = "${calculo.text}3"
            }
            btnQuatro.setOnClickListener {
                calculo.text = "${calculo.text}4"
            }
            btnCinco.setOnClickListener {
                calculo.text = "${calculo.text}5"
            }
            btnSeis.setOnClickListener {
                calculo.text = "${calculo.text}6"
            }
            btnSete.setOnClickListener {
                calculo.text = "${calculo.text}7"
            }
            btnOito.setOnClickListener {
                calculo.text = "${calculo.text}8"
            }
            btnNove.setOnClickListener {
                calculo.text = "${calculo.text}9"
            }
            btnZero.setOnClickListener {
                calculo.text = "${calculo.text}0"
            }
            btnAdicao.setOnClickListener {
                calculo.text = "${calculo.text}+"
            }
            btnSubtracao.setOnClickListener {
                calculo.text = "${calculo.text}-"
            }
            btnMutlplicacao.setOnClickListener {
                calculo.text = "${calculo.text}*"
            }
            btnDivisao.setOnClickListener {
                calculo.text = "${calculo.text}/"
            }
            btnDeletar.setOnClickListener {
                calculo.text = textCalculo.text.dropLast(1).toString()
                calculo.text = textCalculo.text
            }
            btnCE.setOnClickListener {
                calculo.text = ""
                textResultado.text = calculo.text
                textCalculo.text = calculo.text
            }
            btnIgual.setOnClickListener {
                val resultadoCalculado =
                    org.mariuszgromada.math.mxparser.Expression(calculo.text.toString()).calculate()
                if (resultadoCalculado.isNaN()){
                    binding.textResultado.text = "error"
                }else{
                    binding.textResultado.text = resultadoCalculado.toString()
                }
            }

        }

    }

    /*fun avaliarExpressao(expressao: String): Double {
        return try {
            val resultado = ExpressionBuilder(expressao).build().evaluate()
            resultado
        } catch (e: ArithmeticException) {
            // Tratar erro na avaliação da expressão, se necessário
            Double.NaN
        }
    }
    private fun concatenarTexto(valor: String) {
        calculoAtual += valor
        historicoCalculo = calculoAtual
        binding.textCalculo.text = calculoAtual
    }*/

}