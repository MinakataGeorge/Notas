package com.example.notas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notas = ArrayList<Nota>()
        notas.add(Nota(titulo = "Primero nota"))
    }
}