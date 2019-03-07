package com.example.matematicasaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculos.*

class calculos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculos)
        val variable:Intent=intent
        var elNombre = variable.getStringExtra("nombreParametro")
        tvOpcion.text=elNombre

    }
}
