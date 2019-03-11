package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculos.*
import android.widget.Toast
import kotlin.collections.ArrayList

class Calculos : AppCompatActivity(){
private var items=0
private var mensajeRespuesta=""
private var primeros=0
private var segundos=0

//definir las varibles a utilizar
    private var numero1:Int?=null; private var var1:String?=null; private var signo1:String?=null
    private var numero2:Int?=null; private var var2:String?=null; private var signo2:String?=null
    private var numero3:Int?=null; private var var3:String?=null; private var signo3:String?=null
    private var numero4:Int?=null; private var var4:String?=null; private var signo4:String?=null
    private var numero5:Int?=null; private var var5:String?=null; private var signo5:String?=null
    private var numero6:Int?=null; private var var6:String?=null; private var signo6:String?=null
    private var numero7:Int?=null; private var var7:String?=null; private var signo7:String?=null
    private var numero8:Int?=null; private var var8:String?=null; private var signo8:String?=null
    private var numero9:Int?=null; private var var9:String?=null;private var signo9:String?=null
    private var numero10:Int?=null; private var var10:String?=null; private var signo10:String?=null
    private var numero11:Int?=null; private var var11:String?=null;private var signo11:String?=null
    private var numero12:Int?=null; private var var12:String?=null
    private var resultado=0
    private var respuesta =""

    private var lasVariables = ArrayList<String>()
    private var losValores = ArrayList<Int>()
    private var losSignos = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculos)
        val variable:Intent=intent
        val elNombre = variable.getStringExtra("nombreParametro")
        txtOpcion.text=elNombre
        //llamamos a lafunción ocultarTodo
        ocultarTodo()
        limpiarTodo()

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
                    4->mensajeRespuesta= calcularCuatro()
                    5->mensajeRespuesta=calcularCinco()
                    6->mensajeRespuesta=calcularSeis()
                    7->mensajeRespuesta=calcularSiete()
                    8->mensajeRespuesta=calcularOcho()
                    9-> mensajeRespuesta=calcularNueve()
                    10->mensajeRespuesta=calcularDiez()
                    11->mensajeRespuesta=calcularOnce()
                    12->mensajeRespuesta=calcularDoce()
                }
            txtResultado.text= mensajeRespuesta
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
        txtNumero12.setText(""); txtVariable12.setText("");txtResultado.text=""
         losValores.clear()
        lasVariables.clear()
        losSignos.clear()
        primeros=0
        segundos=0
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

        if(txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() ||txtSigno1.text.isNullOrEmpty()){
            respuesta="Hay datos vacios"
        }else if(txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty()) {
            respuesta="Hay datos vacios"
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()

            //validamos si ambas variables son iguales
            if (var1.equals(var2)) {
                if (signo1!!.contentEquals("+")) {
                    resultado = numero1!! + numero2!!
                    respuesta = "$resultado$var1"
                } else if (signo1!!.contentEquals("-")) {
                    resultado = numero1!! - numero2!!
                    respuesta = "$resultado$var1"
                }
            } else {

                val r1: String
                val cambio1: Int
                val r2: String
                val cambio2: Int

                if ( Opciones.resp==1) {
                    cambio1 = (numero2!! * -1)
                    cambio2 = (numero1!! * -1)
                    r1 = "$var1 = $cambio1$var2 /$numero1"
                    r2 = "$var2 = $cambio2$var1 /$numero2"
                    respuesta = "$r1  ,  $r2"
                } else {
                    respuesta = "$numero1$var1 $signo1 $numero2$var2"
                }
            }
        }

        return respuesta
    }
    private fun calcularTres():String {
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)

            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..2){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..2){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
               //Calculamos el resultado
                for(x in 0..2){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..2){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

        }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularCuatro():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()

            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)

            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..3){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..3){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..3){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..3){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularCinco():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()


            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)

            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..4){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..4){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..4){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..4){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularSeis():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()||txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()
            signo5=txtSigno5.text.toString()

            numero6= txtNumero6.text.toString().toInt()
            var6= txtVariable6.text.toString()


            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)

            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..5){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..5){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..5){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..5){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularSiete():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()||txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty() ||txtSigno6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero7.text.isNullOrEmpty() || txtVariable7.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()
            signo5=txtSigno5.text.toString()

            numero6= txtNumero6.text.toString().toInt()
            var6= txtVariable6.text.toString()
            signo6=txtSigno6.text.toString()

            numero7= txtNumero7.text.toString().toInt()
            var7= txtVariable7.text.toString()


            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)
            lasVariables.add(var7!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)
            losValores.add(numero7!!)

            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)
            losSignos.add(signo6!!)


            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..6){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..6){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..6){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..6){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularOcho():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()||txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty() ||txtSigno6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero7.text.isNullOrEmpty() || txtVariable7.text.isNullOrEmpty()||txtSigno7.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero8.text.isNullOrEmpty() || txtVariable8.text.isNullOrEmpty() ) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()
            signo5=txtSigno5.text.toString()

            numero6= txtNumero6.text.toString().toInt()
            var6= txtVariable6.text.toString()
            signo6=txtSigno6.text.toString()

            numero7= txtNumero7.text.toString().toInt()
            var7= txtVariable7.text.toString()
            signo7=txtSigno7.text.toString()

            numero8= txtNumero8.text.toString().toInt()
            var8= txtVariable8.text.toString()




            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)
            lasVariables.add(var7!!)
            lasVariables.add(var8!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)
            losValores.add(numero8!!)

            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)
            losSignos.add(signo6!!)
            losSignos.add(signo7!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..7){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..7){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..7){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..7){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularNueve():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()||txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty() ||txtSigno6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero7.text.isNullOrEmpty() || txtVariable7.text.isNullOrEmpty()||txtSigno7.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero8.text.isNullOrEmpty() || txtVariable8.text.isNullOrEmpty()||txtSigno8.text.isNullOrEmpty() ) {
            respuesta = "hay datos vacios."
        }else if (txtNumero9.text.isNullOrEmpty() || txtVariable9.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()
            signo5=txtSigno5.text.toString()

            numero6= txtNumero6.text.toString().toInt()
            var6= txtVariable6.text.toString()
            signo6=txtSigno6.text.toString()

            numero7= txtNumero7.text.toString().toInt()
            var7= txtVariable7.text.toString()
            signo7=txtSigno7.text.toString()

            numero8= txtNumero8.text.toString().toInt()
            var8= txtVariable8.text.toString()
            signo8=txtSigno8.text.toString()

            numero9= txtNumero9.text.toString().toInt()
            var9= txtVariable9.text.toString()

            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)
            lasVariables.add(var7!!)
            lasVariables.add(var8!!)
            lasVariables.add(var9!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)
            losValores.add(numero7!!)
            losValores.add(numero8!!)
            losValores.add(numero9!!)


            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)
            losSignos.add(signo6!!)
            losSignos.add(signo7!!)
            losSignos.add(signo8!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..8){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..8){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..8){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..8){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularDiez():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()||txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty() ||txtSigno6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero7.text.isNullOrEmpty() || txtVariable7.text.isNullOrEmpty()||txtSigno7.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero8.text.isNullOrEmpty() || txtVariable8.text.isNullOrEmpty()||txtSigno8.text.isNullOrEmpty() ) {
            respuesta = "hay datos vacios."
        }else if (txtNumero9.text.isNullOrEmpty() || txtVariable9.text.isNullOrEmpty()||txtSigno9.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero10.text.isNullOrEmpty() || txtVariable10.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()
            signo5=txtSigno5.text.toString()

            numero6= txtNumero6.text.toString().toInt()
            var6= txtVariable6.text.toString()
            signo6=txtSigno6.text.toString()

            numero7= txtNumero7.text.toString().toInt()
            var7= txtVariable7.text.toString()
            signo7=txtSigno7.text.toString()

            numero8= txtNumero8.text.toString().toInt()
            var8= txtVariable8.text.toString()
            signo8=txtSigno8.text.toString()

            numero9= txtNumero9.text.toString().toInt()
            var9= txtVariable9.text.toString()
            signo9=txtSigno9.text.toString()

            numero10= txtNumero10.text.toString().toInt()
            var10= txtVariable10.text.toString()

            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)
            lasVariables.add(var7!!)
            lasVariables.add(var8!!)
            lasVariables.add(var9!!)
            lasVariables.add(var10!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)
            losValores.add(numero7!!)
            losValores.add(numero8!!)
            losValores.add(numero9!!)
            losValores.add(numero10!!)


            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)
            losSignos.add(signo6!!)
            losSignos.add(signo7!!)
            losSignos.add(signo8!!)
            losSignos.add(signo9!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..9){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..9){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..9){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..9){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta
    }
    private fun calcularOnce():String{
        val primeraVariable: String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty()|| txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }  else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty()|| txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty()||txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty() ||txtSigno6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero7.text.isNullOrEmpty() || txtVariable7.text.isNullOrEmpty()||txtSigno7.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero8.text.isNullOrEmpty() || txtVariable8.text.isNullOrEmpty()||txtSigno8.text.isNullOrEmpty() ) {
            respuesta = "hay datos vacios."
        }else if (txtNumero9.text.isNullOrEmpty() || txtVariable9.text.isNullOrEmpty()||txtSigno9.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero10.text.isNullOrEmpty() || txtVariable10.text.isNullOrEmpty()||txtSigno10.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else if (txtNumero11.text.isNullOrEmpty() || txtVariable11.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        }else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4= txtNumero4.text.toString().toInt()
            var4= txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5= txtNumero5.text.toString().toInt()
            var5= txtVariable5.text.toString()
            signo5=txtSigno5.text.toString()

            numero6= txtNumero6.text.toString().toInt()
            var6= txtVariable6.text.toString()
            signo6=txtSigno6.text.toString()

            numero7= txtNumero7.text.toString().toInt()
            var7= txtVariable7.text.toString()
            signo7=txtSigno7.text.toString()

            numero8= txtNumero8.text.toString().toInt()
            var8= txtVariable8.text.toString()
            signo8=txtSigno8.text.toString()

            numero9= txtNumero9.text.toString().toInt()
            var9= txtVariable9.text.toString()
            signo9=txtSigno9.text.toString()

            numero10= txtNumero10.text.toString().toInt()
            var10= txtVariable10.text.toString()
            signo10=txtSigno10.text.toString()

            numero11= txtNumero11.text.toString().toInt()
            var11= txtVariable11.text.toString()


            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)
            lasVariables.add(var7!!)
            lasVariables.add(var8!!)
            lasVariables.add(var9!!)
            lasVariables.add(var10!!)
            lasVariables.add(var11!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)
            losValores.add(numero7!!)
            losValores.add(numero8!!)
            losValores.add(numero9!!)
            losValores.add(numero10!!)
            losValores.add(numero11!!)


            if(numero1!!<0){losSignos.add("-")}
            else{losSignos.add("+")}
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)
            losSignos.add(signo6!!)
            losSignos.add(signo7!!)
            losSignos.add(signo8!!)
            losSignos.add(signo9!!)
            losSignos.add(signo10!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for(x in 0..10){
                if(lasVariables[x]!=primeraVariable){segundaVariable=lasVariables[x]}
                if(segundaVariable!=""){break;}
            }
            //Validamos que solo hayan dos variables
            for(x in 0..10){
                if(lasVariables[x]!=primeraVariable && lasVariables[x]!=segundaVariable){repetidos++}
            }
            respuesta = if(repetidos!=0){
                "Hay más de 2 variables."
            }else{
                //Calculamos el resultado
                for(x in 0..10){
                    if(lasVariables[x]==primeraVariable){primeros+=losValores[x]}
                    else{segundos+=losValores[x]}
                }


                for(x in 0..10){
                    if(losSignos[x]=="-" && lasVariables[x]==primeraVariable){
                        primeros-=(losValores[x]*2)
                    }else if(losSignos[x]=="-" && lasVariables[x]==segundaVariable){
                        segundos-=(losValores[x]*2)
                    }
                }
                if(segundos<0){
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                }else{
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }
        }
        return respuesta

    }
    private fun calcularDoce():String {
        val primeraVariable:String
        var segundaVariable=""
        var repetidos=0
        if (txtNumero1.text.isNullOrEmpty() || txtVariable1.text.isNullOrEmpty() || txtSigno1.text.isNullOrEmpty()) {
            respuesta = "Hay datos vacios"
        } else if (txtNumero2.text.isNullOrEmpty() || txtVariable2.text.isNullOrEmpty() || txtSigno2.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios"
        } else if (txtNumero3.text.isNullOrEmpty() || txtVariable3.text.isNullOrEmpty() || txtSigno3.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero4.text.isNullOrEmpty() || txtVariable4.text.isNullOrEmpty() || txtSigno4.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero5.text.isNullOrEmpty() || txtVariable5.text.isNullOrEmpty() || txtSigno5.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero6.text.isNullOrEmpty() || txtVariable6.text.isNullOrEmpty() || txtSigno6.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero7.text.isNullOrEmpty() || txtVariable7.text.isNullOrEmpty() || txtSigno7.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero8.text.isNullOrEmpty() || txtVariable8.text.isNullOrEmpty() || txtSigno8.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero9.text.isNullOrEmpty() || txtVariable9.text.isNullOrEmpty() || txtSigno9.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero10.text.isNullOrEmpty() || txtVariable10.text.isNullOrEmpty() || txtSigno10.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero11.text.isNullOrEmpty() || txtVariable11.text.isNullOrEmpty() || txtSigno11.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else if (txtNumero12.text.isNullOrEmpty() || txtVariable12.text.isNullOrEmpty()) {
            respuesta = "hay datos vacios."
        } else {
            numero1 = txtNumero1.text.toString().toInt()
            var1 = txtVariable1.text.toString()
            signo1 = txtSigno1.text.toString()

            numero2 = txtNumero2.text.toString().toInt()
            var2 = txtVariable2.text.toString()
            signo2 = txtSigno2.text.toString()

            numero3 = txtNumero3.text.toString().toInt()
            var3 = txtVariable3.text.toString()
            signo3 = txtSigno3.text.toString()

            numero4 = txtNumero4.text.toString().toInt()
            var4 = txtVariable4.text.toString()
            signo4 = txtSigno4.text.toString()

            numero5 = txtNumero5.text.toString().toInt()
            var5 = txtVariable5.text.toString()
            signo5 = txtSigno5.text.toString()

            numero6 = txtNumero6.text.toString().toInt()
            var6 = txtVariable6.text.toString()
            signo6 = txtSigno6.text.toString()

            numero7 = txtNumero7.text.toString().toInt()
            var7 = txtVariable7.text.toString()
            signo7 = txtSigno7.text.toString()

            numero8 = txtNumero8.text.toString().toInt()
            var8 = txtVariable8.text.toString()
            signo8 = txtSigno8.text.toString()

            numero9 = txtNumero9.text.toString().toInt()
            var9 = txtVariable9.text.toString()
            signo9 = txtSigno9.text.toString()

            numero10 = txtNumero10.text.toString().toInt()
            var10 = txtVariable10.text.toString()
            signo10 = txtSigno10.text.toString()

            numero11 = txtNumero11.text.toString().toInt()
            var11 = txtVariable11.text.toString()
            signo11 = txtSigno11.text.toString()

            numero12 = txtNumero12.text.toString().toInt()
            var12 = txtVariable12.text.toString()


            //cargamos las variables el la lista
            lasVariables.add(var1!!)
            lasVariables.add(var2!!)
            lasVariables.add(var3!!)
            lasVariables.add(var4!!)
            lasVariables.add(var5!!)
            lasVariables.add(var6!!)
            lasVariables.add(var7!!)
            lasVariables.add(var8!!)
            lasVariables.add(var9!!)
            lasVariables.add(var10!!)
            lasVariables.add(var11!!)
            lasVariables.add(var12!!)

            losValores.add(numero1!!)
            losValores.add(numero2!!)
            losValores.add(numero3!!)
            losValores.add(numero4!!)
            losValores.add(numero5!!)
            losValores.add(numero6!!)
            losValores.add(numero7!!)
            losValores.add(numero8!!)
            losValores.add(numero9!!)
            losValores.add(numero10!!)
            losValores.add(numero11!!)
            losValores.add(numero12!!)


            if (numero1!! < 0) {
                losSignos.add("-")
            } else {
                losSignos.add("+")
            }
            losSignos.add(signo1!!)
            losSignos.add(signo2!!)
            losSignos.add(signo3!!)
            losSignos.add(signo4!!)
            losSignos.add(signo5!!)
            losSignos.add(signo6!!)
            losSignos.add(signo7!!)
            losSignos.add(signo8!!)
            losSignos.add(signo9!!)
            losSignos.add(signo10!!)
            losSignos.add(signo11!!)

            //definimos las dos variables iniciales
            primeraVariable = lasVariables[0]
            //recorremos todaslos valores del arreglo para identificar la segunda variable
            //y detectar si hay más de dos variables
            for (x in 0..11) {
                if (lasVariables[x] != primeraVariable) {
                    segundaVariable = lasVariables[x]
                }
                if (segundaVariable != "") {
                    break
                }
            }
            //Validamos que solo hayan dos variables
            for (x in 0..11) {
                if (lasVariables[x] != primeraVariable && lasVariables[x] != segundaVariable) {
                    repetidos++
                }
            }
            respuesta = if (repetidos != 0) {
                "Hay más de 2 variables."
            } else {
                //Calculamos el resultado
                for (x in 0..11) {
                    if (lasVariables[x] == primeraVariable) {
                        primeros += losValores[x]
                    } else {
                        segundos += losValores[x]
                    }
                }


                for (x in 0..11) {
                    if (losSignos[x] == "-" && lasVariables[x] == primeraVariable) {
                        primeros -= (losValores[x] * 2)
                    } else if (losSignos[x] == "-" && lasVariables[x] == segundaVariable) {
                        segundos -= (losValores[x] * 2)
                    }
                }
                if (segundos < 0) {
                    "$primeros$primeraVariable  $segundos$segundaVariable"
                } else {
                    "$primeros$primeraVariable + $segundos$segundaVariable"
                }

            }
            val r1: String
            val cambio1: Int
            val r2: String
            val cambio2: Int

            if ( Opciones.resp==1) {
                cambio1 = (segundos * -1)
                cambio2 = (primeros * -1)
                r1 = "$var1 = $cambio1$var2 /$primeros"
                r2 = "$var2 = $cambio2$var1 /$segundos"
                respuesta = "$r1  ,  $r2"
            }

        }
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


