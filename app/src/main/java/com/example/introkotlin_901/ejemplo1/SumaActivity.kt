package com.example.introkotlin_901.ejemplo1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class SumaActivity : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView
    private lateinit var rbSumar: RadioButton
    private lateinit var rbRestar: RadioButton
    private lateinit var rbMultiplicar: RadioButton
    private lateinit var rbDividir: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suma)

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        tv1 = findViewById(R.id.tv1)
        rbSumar = findViewById(R.id.rbSumar)
        rbRestar = findViewById(R.id.rbRestar)
        rbMultiplicar = findViewById(R.id.rbMultiplicar)
        rbDividir = findViewById(R.id.rbDividir)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: View) {
        val num1 = et1.text.toString().toDouble()
        val num2 = et2.text.toString().toDouble()
        var resultado = 0.0

        when {
            rbSumar.isChecked -> resultado = num1 + num2
            rbRestar.isChecked -> resultado = num1 - num2
            rbMultiplicar.isChecked -> resultado = num1 * num2
            rbDividir.isChecked -> {
                if (num2 != 0.0) {
                    resultado = num1 / num2
                } else {
                    tv1.text = "Error: división por cero"
                    return
                }
            }
        }

        tv1.text = "Resultado= $resultado"
    }
}