package com.example.matematicasaplicacion


import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnPerfil.setOnClickListener {
        // llamamos a el activity perfil cuando se haga click sonbre el boton
        val abrir=Intent(this,Perfil::class.java)
        startActivity(abrir)
    }

        // llamamos el activity comenzar cuando pulsen el boton comenzar
        btnComenzar.setOnClickListener(){
            val abrir=Intent(this,Opciones::class.java)
            val nombre="Amigo"
            abrir.putExtra("nombreParametro",nombre)
            startActivity(abrir)
        }

        //verificamos si el usuario hace click en el boton salir
        btnSalir.setOnClickListener(){
            this.finish()
        }

    }
}
