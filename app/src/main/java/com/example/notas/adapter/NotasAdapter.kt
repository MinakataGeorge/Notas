package com.example.notas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notas.modelo.Nota
//Cada titulo que le pongamos a las notas este se las pondra
class NotasAdapter(notas:ArrayList<Nota>, contexto: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    //nuestras variables para poder hacer que la app funcione
    var notas:ArrayList<Nota>?=null
    var contexto:Context?=null
    //constructor
    init {
        this.notas = notas
        this.contexto = contexto
    }


    //retorna un viewholder/la class
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotasAdapter.ViewHolder {
        val vistaNota:View = LayoutInflater.from(contexto).inflate(R.layout.nota_layout,parent,attachToRootfalse)
        val notaViewHolder = ViewHolder(vistaNota)
        vistaNota.tag = notaViewHolder
        return notaViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitulo.text = notas!!.get[position].titulo
        holder.tvDescripcion.text = notas!!.get[position].descripcion



    }
    //Contar cuantas notas hay/habra
    override fun getItemCount(): Int {
        return this.notas!!.count()
    }

    //se recive la vista personalizada
    class ViewHolder(v:View):RecyclerView.ViewHolder(v){
        lateinit var tvTitulo:TextView
        lateinit var tvDescripcion:TextView
        //Seria como el oncreate
        init {
            tvTitulo = v.findViewById(R.id.tvTitulo)
            tvDescripcion = v.findViewById(R.id.tvDescripcion)

        }
    }
}