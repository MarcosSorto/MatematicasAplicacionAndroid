package com.example.matematicasaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_racionales.*

class Racionales : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_racionales)
        btnCalcular.setOnClickListener(){


            if(txtRadical.text.toString() == "√"){
                txtRespuesta.setText("Correcto")
            }else{
                txtRespuesta.setText("Error")
            }
        }


    }

}
