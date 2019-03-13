package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cuadratica.*
import kotlin.math.sqrt

class Cuadratica : AppCompatActivity() {
    //definiendo las variables a utilizar
    private var mensaje:String?=""
    private var mensaje2:String?=""
    private var resp1:Float?=null
    private var resp2:Float?=null
    private var interno:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadratica)
        val variable: Intent =intent
        val elNombre = variable.getStringExtra("nombreParametro")
        txtTitulo.text = elNombre
        //definimos las funcionalidad de limpiar
        btnLimpiar.setOnClickListener{
            limpiarTodo()
        }

        //definimos la funcionalidad de calcular
        btnCalcular.setOnClickListener{
            //validamos si se encuentran llenos los datos
            if(txtPrimero.text.isNullOrEmpty()||txtSegundo.text.isNullOrEmpty()||txtTercero.text.isNullOrEmpty() ){
                mensaje="Hay datos sin llenar"
            }else{
                val a:Int=txtPrimero.text.toString().toInt()
                val b:Int=txtSegundo.text.toString().toInt()
                val c:Int=txtTercero.text.toString().toInt()

                interno = ((b*b)-(4*a*c))

                //verificamos si interno es negativo
                if(interno!!<0){
                    interno=interno!!*-1
                    resp1 = ((b*-1) + (sqrt(interno!!.toFloat())))/(2*a)
                    resp2 = ((b*-1) - (sqrt(interno!!.toFloat())))/(2*a)

                    mensaje ="X1=$resp1 i"
                    mensaje2="X2=$resp2 i"

                }else  {
                    //calculamos el resto de la ecuación
                    resp1 = ((b*-1) + (sqrt(interno!!.toFloat())))/(2*a)
                    resp2 = ((b*-1) - (sqrt(interno!!.toFloat())))/(2*a)

                    mensaje ="X1=$resp1 "
                    mensaje2="X2=$resp2 "
                }

            }
            txtResultado.text =mensaje
            txtResultado2.text=mensaje2
        }

    }

    private fun limpiarTodo(){
        txtPrimero.setText("")
        txtSegundo.setText("")
        txtTercero.setText("")
        txtResultado.text=""
        txtResultado2.text=""
        txtPrimero.hasFocus()
    }

}