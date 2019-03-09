package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perfil.*

class Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)


        // verificamos si hace click en el boton comenzar

        btnComenzar.setOnClickListener(){
            val nombre: String = txtNombre.text.toString()
            val abrir=Intent(this,Opciones::class.java)
            abrir.putExtra("nombreParametro",nombre)
            startActivity(abrir)
        }
    }
}
