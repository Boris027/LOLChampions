package com.turing.alan.cpifp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.databinding.ChampionviewBinding

class ChampionAdapter(private val championList:List<Champion>):RecyclerView.Adapter<ChampionAdapter.ChampionViewHolder>() {

    class ChampionViewHolder(private val binding: ChampionviewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(campeon: Champion){
            binding.nombre.text=campeon.name
            binding.lore.text=campeon.lore
            binding.titulo.text=campeon.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder {
        val binding:ChampionviewBinding=ChampionviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ChampionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return championList.size
    }

    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {
        holder.bind(championList[position])
    }

}



