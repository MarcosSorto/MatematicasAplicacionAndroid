package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_opciones.*

class Opciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)
        val variable:Intent=intent
        val elNombre = variable.getStringExtra("nombreParametro")
        tvNombre.text="Elige una opción $elNombre"

        // verificamos si se ha seleccionado la primera opcion
        btnSimplificarExpresion.setOnClickListener{
            val seleccion: String = btnSimplificarExpresion.text.toString()
            val abrir=Intent(this,Calculos::class.java)
            abrir.putExtra("nombreParametro",seleccion)
            resp=0
            startActivity(abrir)
        }

        //verificamos si se ha seleccionado la segunda opcion
        btnResolverEcuacion.setOnClickListener{
            val seleccion:String=btnResolverEcuacion.text.toString()
            val abrir=Intent(this,Calculos::class.java)
            abrir.putExtra("nombreParametro",seleccion)
            resp=1

            startActivity((abrir))
        }

        //verificamos is se accede a resolver el radical
        btnResolverRadical.setOnClickListener{
            val abrir=Intent(this,Racionales::class.java)
            startActivity((abrir))
        }

        //verificamos si se accede a resolver la cuadratica
        btnResolverCuadratica.setOnClickListener{
            val seleccion:String=btnResolverCuadratica.text.toString()
            val abrir=Intent(this,Cuadratica::class.java)
            abrir.putExtra("nombreParametro",seleccion)
            startActivity((abrir))
        }

    }
    companion object {

        var resp:Int= 0
    }
}
