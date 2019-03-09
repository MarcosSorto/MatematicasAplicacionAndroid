package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculos.*
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList

class Calculos : AppCompatActivity(){
private var items=0
private var mensajeRespuesta=""
//definir las varibles a utilizar
    private var numero1=0; private var var1=""; private var signo1=""
    private var numero2=0; private var var2=""; private var signo2=""
    private var numero3=0; private var var3=""; private var signo3=""
    private var numero4=0; private var var4=""; private var signo4=""
    private var numero5=0; private var var5=""; private var signo5=""
    private var numero6=0; private var var6=""; private var signo6=""
    private var numero7=0; private var var7=""; private var signo7=""
    private var numero8=0; private var var8=""; private var signo8=""
    private var numero9=0; private var var9=""; private var signo9=""
    private var numero10=0; private var var10=""; private var signo10=""
    private var numero11=0; private var var11=""; private var signo11=""
    private var numero12=0; private var var12=""
    private var resultado=0
    private var respuesta =""
    private var primeraVariable=""
    private var segundaVariable=""
    var lasVariables = ArrayList<String>()
    var losValores = ArrayList<Int>()
    var losSignos = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculos)
        val variable:Intent=intent
        val elNombre = variable.getStringExtra("nombreParametro")
        txtOpcion.text=elNombre

        //llamamos a lafunción ocultarTodo
        ocultarTodo()
        btnGenerar.setOnClickListener{
            if (txtCantidad.text.isNullOrEmpty()){
                Toast.makeText(this, "¡Debes Ingresar la cantidad de Intems !", Toast.LENGTH_LONG).show()
            }else{
                val laCantidad = txtCantidad.text.toString().toInt()
                items = laCantidad
                if (laCantidad <=0 || laCantidad>12){
                    Toast.makeText(this, "¡no puedes ingresar más de 12 Intems ó generar 0 Items !", Toast.LENGTH_LONG).show()

                    txtCantidad.hasFocus()
                }else{
                    Toast.makeText(this, "Generando...", Toast.LENGTH_SHORT).show()
                    mostrando(laCantidad)
                }
        }
        }

        //configuramos el boton limpiar
        btnLimpiar.setOnClickListener{
            ocultarTodo()
            limpiarTodo()
            txtCantidad.hasFocus()
        }


        btnCalcular.setOnClickListener{

                when(items){
                    2-> mensajeRespuesta= calcularDos()
                    3-> mensajeRespuesta= calcularTres()
                }


            txtResultado.setText(mensajeRespuesta)
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
        txtNumero12.visibility= View.INVISIBLE; txtVariable12.visibility= View.INVISIBLE; txtResultado.visibility=View.INVISIBLE

   }
    private fun limpiarTodo(){
        txtNumero1.setText("") ; txtVariable1.setText(""); txtSigno1.setText("")
        txtNumero2.setText("") ; txtVariable2.setText(""); txtSigno2.setText("")
        txtNumero3.setText("") ; txtVariable3.setText(""); txtSigno3.setText("")
        txtNumero4.setText("") ; txtVariable4.setText(""); txtSigno4.setText("")
        txtNumero5.setText("") ; txtVariable5.setText(""); txtSigno5.setText("")
        txtNumero6.setText("") ; txtVariable6.setText(""); txtSigno6.setText("")
        txtNumero7.setText("") ; txtVariable7.setText(""); txtSigno7.setText("")
        txtNumero8.setText("") ; txtVariable8.setText(""); txtSigno8.setText("")
        txtNumero9.setText("") ; txtVariable9.setText(""); txtSigno9.setText("")
        txtNumero10.setText(""); txtVariable10.setText(""); txtSigno10.setText("")
        txtNumero11.setText(""); txtVariable11.setText(""); txtSigno11.setText("")
        txtNumero12.setText(""); txtVariable12.setText("");txtResultado.setText("")
    }
    private fun mostrando( numero:Int){
        txtResultado.visibility=View.VISIBLE
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

    private fun calcularDos():String{
        numero1= txtNumero1.text.toString().toInt()
        var1= txtVariable1.text.toString()
        signo1= txtSigno1.text.toString()
        numero2= txtNumero2.text.toString().toInt()
        var2 = txtVariable2.text.toString()

        //validamos si ambas variables son iguales
        if (var1.equals(var2))
        {
            if(signo1.contentEquals("+")){
                resultado = numero1 + numero2
                respuesta = "$resultado$var1"
            }else if(signo1.contentEquals("-")){
                resultado = numero1-numero2
                respuesta = "$resultado$var1"
            }
        }else{
            respuesta = "$numero1$var1 = $numero2$var2"
        }
        return respuesta
    }

    private fun calcularTres():String{
        //cargamos los datos de inicio
        numero1= txtNumero1.text.toString().toInt()
        var1= txtVariable1.text.toString()
        signo1= txtSigno1.text.toString()

        numero2= txtNumero2.text.toString().toInt()
        var2 = txtVariable2.text.toString()
        signo2= txtSigno2.text.toString()

        numero3=txtNumero3.text.toString().toInt()
        var3= txtVariable3.text.toString()

            lasVariables.add(var1)
            lasVariables.add(var2)
            lasVariables.add(var3)



            primeraVariable = lasVariables[0]

            // definimos las primeras dos variables a utilizar
            for(x in 1..3){
                if (lasVariables[x]!=primeraVariable){
                    segundaVariable= lasVariables[x]
                }
                if(segundaVariable!=""){
                    break
                }
            }
            //recoremos en busca de variables que no sean las ya asignadas.
            for(x in 0..2){
            if(lasVariables[x]!=primeraVariable || lasVariables[x]!=segundaVariable){
                Toast.makeText(this,"Hay más de dos variables en la ecuación,¡Revisa!",Toast.LENGTH_LONG).show()

                }
             }

            respuesta = "las variables ingresadas son $primeraVariable y $segundaVariable"


        return respuesta
    }
    private fun mostrarDos(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
    }
    private fun mostrarTres(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
    }
    private fun mostrarCuatro(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
    }
    private fun mostrarCinco(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
    }
    private fun mostrarSeis(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
    }
    private fun mostrarSiete(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
    }
    private fun mostrarOcho(){
        txtNumero1.visibility= View.VISIBLE;txtSigno1.visibility= View.VISIBLE;txtVariable1.visibility= View.VISIBLE
        txtNumero2.visibility= View.VISIBLE;txtSigno2.visibility= View.VISIBLE;txtVariable2.visibility= View.VISIBLE
        txtNumero3.visibility= View.VISIBLE;txtSigno3.visibility= View.VISIBLE;txtVariable3.visibility= View.VISIBLE
        txtNumero4.visibility= View.VISIBLE;txtSigno4.visibility= View.VISIBLE;txtVariable4.visibility= View.VISIBLE
        txtNumero5.visibility= View.VISIBLE;txtSigno5.visibility= View.VISIBLE;txtVariable5.visibility= View.VISIBLE
        txtNumero6.visibility= View.VISIBLE;txtSigno6.visibility= View.VISIBLE;txtVariable6.visibility= View.VISIBLE
        txtNumero7.visibility= View.VISIBLE;txtSigno7.visibility= View.VISIBLE;txtVariable7.visibility= View.VISIBLE
        txtNumero8.visibility= View.VISIBLE;txtVariable8.visibility= View.VISIBLE
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
        txtNumero9.visibility= View.VISIBLE;txtVariable9.visibility= View.VISIBLE
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
        txtNumero10.visibility= View.VISIBLE;txtVariable10.visibility= View.VISIBLE
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
        txtNumero11.visibility= View.VISIBLE;txtVariable11.visibility= View.VISIBLE
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


