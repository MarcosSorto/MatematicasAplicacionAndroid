package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculos.*
import android.widget.Toast
open class Calculos : AppCompatActivity(){

    //instanciamos de la clase EcuacionItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculos)
        val variable:Intent=intent
        val elNombre = variable.getStringExtra("nombreParametro")
        txtOpcion.text=elNombre

        //llamamos a lafunción ocultarTodo
        ocultarTodo()
        btnGenerar.setOnClickListener(){
            if (txtCantidad.text.isNullOrEmpty()){
                Toast.makeText(this, "¡Debes Ingresar la cantidad de Intems !", Toast.LENGTH_LONG).show()
            }else{
                val laCantidad = txtCantidad.text.toString().toInt()
                if (laCantidad <=0 || laCantidad>12){
                    Toast.makeText(this, "¡no puedes ingresar más de 12 Intems ó generar 0 Items !", Toast.LENGTH_LONG).show()
                    txtCantidad.hasFocus()
                }else{
                    Toast.makeText(this, "Generando...", Toast.LENGTH_SHORT).show()
                    mostrando(laCantidad)
                }
            }
        }


}

    private fun ocultarTodo(){
        //ocultamos todas lo items de la ecuación.
        txtNumero1.visibility= View.INVISIBLE ; txtVariable1.visibility= View.INVISIBLE; txtSigno1.visibility= View.INVISIBLE
        txtNumero2.visibility= View.INVISIBLE ; txtVariable2.visibility= View.INVISIBLE; txtSigno2.visibility= View.INVISIBLE
        txtNumero3.visibility= View.INVISIBLE ; txtVariable3.visibility= View.INVISIBLE; txtSigno3.visibility= View.INVISIBLE
        txtNumero4.visibility= View.INVISIBLE ; txtVariable4.visibility= View.INVISIBLE; txtSigno4.visibility= View.INVISIBLE
        txtNumero5.visibility= View.INVISIBLE ; txtVariable5.visibility= View.INVISIBLE; txtSigno5.visibility= View.INVISIBLE
        txtNumero6.visibility= View.INVISIBLE ; txtVariable6.visibility= View.INVISIBLE; txtSigno6.visibility= View.INVISIBLE
        txtNumero7.visibility= View.INVISIBLE ; txtVariable7.visibility= View.INVISIBLE; txtSigno7.visibility= View.INVISIBLE
        txtNumero8.visibility= View.INVISIBLE ; txtVariable8.visibility= View.INVISIBLE; txtSigno8.visibility= View.INVISIBLE
        txtNumero9.visibility= View.INVISIBLE ; txtVariable9.visibility= View.INVISIBLE; txtSigno9.visibility= View.INVISIBLE
        txtNumero10.visibility= View.INVISIBLE; txtVariable10.visibility= View.INVISIBLE; txtSigno10.visibility= View.INVISIBLE
        txtNumero11.visibility= View.INVISIBLE; txtVariable11.visibility= View.INVISIBLE; txtSigno11.visibility= View.INVISIBLE
        txtNumero12.visibility= View.INVISIBLE; txtVariable12.visibility= View.INVISIBLE

    }

    private fun mostrando( numero:Int){
        when(numero) {
            2->mostrarDos()
            3->mostrarTres()
            4->mostrarCuatro()
            5->mostrarCinco()
            6->mostrarSeis()
            7->mostrarSiete()
            8->mostrarOcho()
            9->mostrarNueve()
            10->mostrarDiez()
            11->mostrarOnce()
            12->mostrarDoce()
        }

    }

    private fun mostrarDos(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
    }
    private fun mostrarTres(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
    }
    private fun mostrarCuatro(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
    }
    private fun mostrarCinco(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
    }
    private fun mostrarSeis(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
    }
    private fun mostrarSiete(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
    }
    private fun mostrarOcho(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
        txtNumero8.visibility= View.VISIBLE;txtSigno8.visibility= View.VISIBLE;txtVariable8.visibility= View.VISIBLE
    }
    private fun mostrarNueve(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
        txtNumero8.visibility= View.VISIBLE;txtSigno8.visibility= View.VISIBLE;txtVariable8.visibility= View.VISIBLE
        txtNumero9.visibility= View.VISIBLE;txtSigno9.visibility= View.VISIBLE;txtVariable9.visibility= View.VISIBLE
    }
    private fun mostrarDiez(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
        txtNumero8.visibility= View.VISIBLE;txtSigno8.visibility= View.VISIBLE;txtVariable8.visibility= View.VISIBLE
        txtNumero9.visibility= View.VISIBLE;txtSigno9.visibility= View.VISIBLE;txtVariable9.visibility= View.VISIBLE
        txtNumero10.visibility= View.VISIBLE;txtSigno10.visibility= View.VISIBLE;txtVariable10.visibility= View.VISIBLE
    }
    private fun mostrarOnce(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
        txtNumero8.visibility= View.VISIBLE;txtSigno8.visibility= View.VISIBLE;txtVariable8.visibility= View.VISIBLE
        txtNumero9.visibility= View.VISIBLE;txtSigno9.visibility= View.VISIBLE;txtVariable9.visibility= View.VISIBLE
        txtNumero10.visibility= View.VISIBLE;txtSigno10.visibility= View.VISIBLE;txtVariable10.visibility= View.VISIBLE
        txtNumero11.visibility= View.VISIBLE;txtSigno11.visibility= View.VISIBLE;txtVariable11.visibility= View.VISIBLE
    }
    private fun mostrarDoce(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
        txtNumero8.visibility= View.VISIBLE;txtSigno8.visibility= View.VISIBLE;txtVariable8.visibility= View.VISIBLE
        txtNumero9.visibility= View.VISIBLE;txtSigno9.visibility= View.VISIBLE;txtVariable9.visibility= View.VISIBLE
        txtNumero10.visibility= View.VISIBLE;txtSigno10.visibility= View.VISIBLE;txtVariable10.visibility= View.VISIBLE
        txtNumero11.visibility= View.VISIBLE;txtSigno11.visibility= View.VISIBLE;txtVariable11.visibility= View.VISIBLE
        txtNumero12.visibility= View.VISIBLE;txtVariable12.visibility= View.VISIBLE
    }
}


