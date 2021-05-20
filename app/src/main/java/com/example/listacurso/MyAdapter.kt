package com.example.listacurso

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_linguagem.view.*


class MyAdapter(private val linguagens: List<Linguagens>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_linguagem, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(linguagens[position])
    }

    override fun getItemCount(): Int {
    return linguagens.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val imgLogo = itemView.img_logo
        private val txtTitulo = itemView.txt_titulo
        private val txtSubtitulo = itemView.txt_subtitulo

        fun bind(linguagens: Linguagens){
                imgLogo.setImageResource(linguagens.logo)
                txtTitulo.text = linguagens.titulo
                txtSubtitulo.text = linguagens.subTitulo
        }
    }
}