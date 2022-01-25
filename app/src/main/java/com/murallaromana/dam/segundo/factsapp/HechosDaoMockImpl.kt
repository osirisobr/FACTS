package com.murallaromana.dam.segundo.factsapp

class HechosDaoMockImpl: HechosData {
    val list = ArrayList<Hecho>()

    override fun getTodos(): ArrayList<Hecho> {
        list.addAll(
            listOf(

                Hecho(
                    1969,
                    "Apollo 11 llega a la luna",
                ),
                Hecho(2001,"Ataque a las torres gemelas"), Hecho(2001,"Ataque a las torres gemelas"), Hecho(2001,"Ataque a las torres gemelas"), Hecho(2001,"Ataque a las torres gemelas"), Hecho(2001,"Ataque a las torres gemelas"), Hecho(2001,"Ataque a las torres gemelas"),
            )
        )

        return list

    }




}

