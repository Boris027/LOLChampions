package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository

import com.turing.alan.cpifp.databinding.ActivityMainBinding
import com.turing.alan.cpifp.databinding.FragmentTaskListBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TaskListFragment : Fragment() {
    @Inject lateinit var instancia:InMemoryChampionsRepository

    private lateinit var binding: FragmentTaskListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentTaskListBinding.inflate(inflater,container,false)
        val recycleview=binding.champions
        recycleview.layoutManager= LinearLayoutManager(requireContext())
        val championlist=instancia.getChampions()
        val adapter=ChampionAdapter(championlist,::toitemDetail)
        recycleview.adapter=adapter
        return binding.root
    }

    fun toitemDetail(campeon:Champion){
        //Toast.makeText(context, campeon.id.toString(), Toast.LENGTH_LONG).show()

        val action=TaskListFragmentDirections.actionTaskListFragmentToChampiondetail(campeon.id)
        findNavController().navigate(action)
    }





}