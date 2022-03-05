package com.example.appno1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCreditos = findViewById<Button>(R.id.btnCreditos)
        val btnOperaciones = findViewById<Button>(R.id.btnOperaciones)
        val btnPotencia = findViewById<Button>(R.id.btnPotencia)
        val btnHipotenusa = findViewById<Button>(R.id.btnHipotenusa)

        btnCreditos.setOnClickListener{

            Toast.makeText(this, "Aplicación elaborada por Angel López - 201705336", Toast.LENGTH_LONG).show()

        }

        btnOperaciones.setOnClickListener{
            val Operacionestenbasicas = Intent(this, Operaciones::class.java)
            startActivity(Operacionestenbasicas)

        }

        btnPotencia.setOnClickListener{
            val PotenciasActivity = Intent(this, Potencia::class.java)
            startActivity(PotenciasActivity)

        }

        btnHipotenusa.setOnClickListener{
            val HipotenusaActivity = Intent(this, hipotenusa::class.java)
            startActivity(HipotenusaActivity)

        }


    }
}