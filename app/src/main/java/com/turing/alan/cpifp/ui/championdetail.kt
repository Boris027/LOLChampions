package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampiondetailBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class championdetail : Fragment() {

    private lateinit var binding:FragmentChampiondetailBinding
    @Inject lateinit var repository:InMemoryChampionsRepository
    private val args:championdetailArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val campeon=repository.getChampion(args.idchampion)
        binding= FragmentChampiondetailBinding.inflate(inflater,container,false)
        binding.imageview.load(campeon.imageUrl)
        binding.nombre.text=campeon.name
        binding.titulo.text=campeon.title
        binding.lore.text=campeon.lore
        // Inflate the layout for this fragment
        binding.botonsalir.setOnClickListener{
            findNavController().popBackStack()
        }

        return binding.root
    }


}