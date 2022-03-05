package com.example.appno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Operaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones)

        var edValor1 = findViewById<EditText>(R.id.edValor1)
        var edValor2 = findViewById<EditText>(R.id.edValor2)
        var btnSumar = findViewById<Button>(R.id.btnSuma)
        var btnResta = findViewById<Button>(R.id.btnResta)
        var btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        var btnDivision = findViewById<Button>(R.id.btnDivision)
        var btnPromedio  = findViewById<Button>(R.id.btnPromedio)

    btnSumar.setOnClickListener {

        val respuesta = edValor1.text.toString().toDouble() + edValor2.text.toString().toDouble()
        Toast.makeText(this, "La Suma es:  $respuesta", Toast.LENGTH_LONG).show()


    }
        btnResta.setOnClickListener {

            val respuesta = edValor1.text.toString().toDouble() - edValor2.text.toString().toDouble()
            Toast.makeText(this, "La Resta es:  $respuesta", Toast.LENGTH_LONG).show()


        }

        btnMultiplicacion.setOnClickListener {

            val respuesta = edValor1.text.toString().toDouble() * edValor2.text.toString().toDouble()
            Toast.makeText(this, "La Multiplicación es:  $respuesta", Toast.LENGTH_LONG).show()


        }


        btnDivision.setOnClickListener {

            val respuesta = edValor1.text.toString().toDouble() / edValor2.text.toString().toDouble()
            Toast.makeText(this, "La División es:  $respuesta", Toast.LENGTH_LONG).show()


        }

        btnPromedio.setOnClickListener {

            val respuesta = edValor1.text.toString().toDouble() + edValor2.text.toString().toDouble()
            val div = respuesta / 2
            Toast.makeText(this, "El promedio:  $div", Toast.LENGTH_LONG).show()


        }



    }
}