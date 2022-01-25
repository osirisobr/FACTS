package com.murallaromana.dam.segundo.factsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ListaHechosAdapter(val hechos : List<Hecho>, val context: Context) : RecyclerView.Adapter<ListaHechosAdapter.HechosHolder>() {


    class HechosHolder  (view: View) : RecyclerView.ViewHolder(view){

        val tvAnho = itemView.findViewById<TextView>(R.id.tvAnho)
        val tvHecho = itemView.findViewById<TextView>(R.id.tvHecho)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HechosHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.item_hecho, parent, false)

        return HechosHolder(inflater)
    }

    override fun onBindViewHolder(holder: HechosHolder, position: Int) {
        val hecho = hechos.get(position)


        holder.tvAnho.setText(hecho.anho.toString())
        holder.tvHecho.setText(hecho.hecho)

        }

    override fun getItemCount(): Int {
        return hechos.size
    }

}
