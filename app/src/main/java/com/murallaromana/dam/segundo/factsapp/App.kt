package com.murallaromana.dam.segundo.factsapp

import android.app.Application

class App: Application() {
    companion object{
        var hechos: MutableList<Hecho> = ArrayList()
    }
    override fun onCreate(){
        super.onCreate()
        val data = HechosDaoMockImpl()
        hechos = data.getTodos()


    }
}