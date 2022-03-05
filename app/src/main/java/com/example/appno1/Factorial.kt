package com.example.appno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Factorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial)

        var numero = findViewById<EditText>(R.id.numero )
        var btnFactorial = findViewById<Button>(R.id.btnFactorial)

        btnFactorial.setOnClickListener {

            var respuesta = numero.text.toString().toInt()


            for (i in respuesta downTo 1){
                respuesta *= i

            }

            Toast.makeText(this, "El factorial es:  $respuesta", Toast.LENGTH_LONG).show()


        }




    }
}