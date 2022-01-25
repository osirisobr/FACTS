package com.murallaromana.dam.segundo.factsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var rvHechos: RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvHechos=findViewById(R.id.rvHechos)
        rvHechos.layoutManager = LinearLayoutManager(this)
        val hechosDao = HechosDaoMockImpl()
        val hechos = hechosDao.getTodos()
        var adapter = ListaHechosAdapter(hechos, this)
        rvHechos.adapter = adapter

//        Conexion.peticionHttpGet("https://www.google.com/")

    }



}