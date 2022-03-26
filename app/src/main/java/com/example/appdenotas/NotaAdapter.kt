package com.example.appdenotas

import android.content.Context
import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.appdenotas.databinding.ItemNotaBinding

class NotaAdapter(var context: Context, val listaNota: List<Nota>): RecyclerView.Adapter<NotaAdapter.NotaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  NotaViewHolder {
        val binding = ItemNotaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NotaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NotaViewHolder, position: Int) {
        val nota = this.listaNota.get(position)
        with(holder){
            with(nota){
                binding.titulo.text = this.titulo
                binding.subtitulo.text = this.subtitulo
            }
        }
    }

    override fun getItemCount(): Int {
        return listaNota.size
    }

    class NotaViewHolder(val binding: ItemNotaBinding) : RecyclerView.ViewHolder(binding.root) {


    }

}