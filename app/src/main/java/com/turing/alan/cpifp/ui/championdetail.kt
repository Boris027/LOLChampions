package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampiondetailBinding


class championdetail : Fragment() {

    private lateinit var binding:FragmentChampiondetailBinding
    private val repository=InMemoryChampionsRepository.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentChampiondetailBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }


}