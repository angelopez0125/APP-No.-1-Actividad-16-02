package com.example.appno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class hipotenusa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hipotenusa)

        var catetoa = findViewById<EditText>(R.id.catetoa)
        var catetob = findViewById<EditText>(R.id.catetob)
        var btnhipotenusa = findViewById<Button>(R.id.btnHipotenusa)

        btnhipotenusa.setOnClickListener {

            val respuesta = catetoa.text.toString().toDouble() + catetob.text.toString().toDouble()
            Toast.makeText(this, "La Hipotenusa es:  $respuesta", Toast.LENGTH_LONG).show()


        }



    }
}