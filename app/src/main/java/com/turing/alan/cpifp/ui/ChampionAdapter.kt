package com.turing.alan.cpifp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.databinding.ChampionviewBinding
import dagger.hilt.android.AndroidEntryPoint


class ChampionAdapter(private val championList:List<Champion>, private val toItemDetail:((Champion)->Unit)):RecyclerView.Adapter<ChampionAdapter.ChampionViewHolder>() {

    inner class ChampionViewHolder(private val binding: ChampionviewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(campeon: Champion){
            binding.imageview.load(campeon.imageUrl){
                placeholder(R.drawable.imagen)
                error(R.drawable.imagen)
            }
            binding.nombre.text=campeon.name
            binding.titulo.text=campeon.title
            binding.card.setOnClickListener{
                toItemDetail(campeon)
            }
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



