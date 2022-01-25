package com.murallaromana.dam.segundo.factsapp

import java.io.Serializable

data class Hecho(var anho:Int,
                 var hecho:String ): Serializable {

    fun getanhoHecho():Int {
        return anho
    }

    fun gethechoHecho(): String {
        return hecho
    } }