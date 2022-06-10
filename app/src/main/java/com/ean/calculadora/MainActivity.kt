package com.ean.calculadora

import Mundo.dividir
import Mundo.multiplicar
import Mundo.restar
import Mundo.sumar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var boton_suma:Button
        var boton_resta:Button
        var boton_multiplicacion:Button
        var boton_division:Button
        //llamar EditText
        var txt_numero_uno:EditText
        var txt_numero_dos:EditText
        //llamar TextView
        var resultado:TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //llamar Button
        boton_suma = findViewById<Button>(R.id.btn_suma_main)
        boton_resta = findViewById<Button>(R.id.btn_resta_main)
        boton_multiplicacion = findViewById<Button>(R.id.btn_multiplicacion_main)
        boton_division = findViewById<Button>(R.id.btn_division_main)
        //llamar EditText
        txt_numero_uno = findViewById<EditText>(R.id.txt_numero_uno_main)
        txt_numero_dos = findViewById<EditText>(R.id.txt_numero_dos_main)
        //llamar TextView
        resultado = findViewById<TextView>(R.id.view_resultado_main)

        //Acciones o eventos
        boton_suma.setOnClickListener {
            try {
                val numero1 = txt_numero_uno.text.toString().toDouble()
                val numero2 = txt_numero_dos.text.toString().toDouble()

                val result = sumar(numero1, numero2)
                resultado.text = result.toString()
            }
            catch (e: Exception){
                println(e.message)
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }

        boton_resta.setOnClickListener {
            try {
                val numero1 = txt_numero_uno.text.toString().toDouble()
                val numero2 = txt_numero_dos.text.toString().toDouble()

                val result = restar(numero1, numero2)
                resultado.text = result.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }

        boton_multiplicacion.setOnClickListener {
            try {
                val numero1 = txt_numero_uno.text.toString().toDouble()
                val numero2 = txt_numero_dos.text.toString().toDouble()

                val result = multiplicar(numero1, numero2)
                resultado.text = result.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }

        boton_division.setOnClickListener {
            try {
                val numero1 = txt_numero_uno.text.toString().toDouble()
                val numero2 = txt_numero_dos.text.toString().toDouble()

                val result = dividir(numero1, numero2)
                resultado.text = result.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }

    }



}