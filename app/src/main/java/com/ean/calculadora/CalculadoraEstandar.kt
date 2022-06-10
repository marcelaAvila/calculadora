package com.ean.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculadoraEstandar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_estandar)

        val eliminarTodo = findViewById<Button>(R.id.button_eliminar)
        val dividir = findViewById<Button>(R.id.button_division)
        val multiplicar = findViewById<Button>(R.id.button_multiplicacion)
        val restar = findViewById<Button>(R.id.button_resta)
        val suma = findViewById<Button>(R.id.button_suma)
        val resultado = findViewById<Button>(R.id.button_igual)

        val numero_uno = findViewById<Button>(R.id.button_numero_uno)
        val numero_dos = findViewById<Button>(R.id.button_numero_dos)
        val numero_tres = findViewById<Button>(R.id.button_numero_tres)
        val numero_cuatro = findViewById<Button>(R.id.button_numero_cuatro)
        val numero_cinco = findViewById<Button>(R.id.button_numero_cinco)
        val numero_seis = findViewById<Button>(R.id.button_numero_seis)
        val numero_siete = findViewById<Button>(R.id.button_numero_siete)
        val numero_ocho = findViewById<Button>(R.id.button_numero_ocho)
        val numero_nueve = findViewById<Button>(R.id.button_numero_nueve)
        val numero_cero = findViewById<Button>(R.id.button_numero_cero)



    }
}