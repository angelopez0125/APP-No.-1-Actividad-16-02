package com.example.appno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Potencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potencia)

        var edValor1 = findViewById<EditText>(R.id.edValor1)
        var edValor2 = findViewById<EditText>(R.id.edValor2)
        var btnPotencia = findViewById<Button>(R.id.btnPotencia)

        btnPotencia.setOnClickListener {

            val respuesta = Math.pow(edValor1.text.toString().toDouble() , edValor2.text.toString().toDouble())
            Toast.makeText(this, "La Potencia es:  $respuesta", Toast.LENGTH_LONG).show()


        }


    }
}