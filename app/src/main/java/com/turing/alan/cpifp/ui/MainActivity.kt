package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val instancia: ChampionsRepository = InMemoryChampionsRepository.getInstance()
    private lateinit var binding: ActivityMainBinding // Cambié 'main' a 'binding' para más claridad

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Usar View Binding para inflar el layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Solo necesitas esta línea

        // Configurar el padding para la ventana
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Paso 1: Obtener la referencia al RecyclerView
        val recyclerView = binding.champions // Asegúrate de que esto coincide con el ID en el XML

        // Paso 2: Configurar el LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Paso 3: Crear la lista de campeones usando el repositorio
        val championList = instancia.getChampions() // Asegúrate de que este método devuelve la lista de campeones

        // Paso 4: Crear y asignar el Adapter
        val adapter = ChampionAdapter(championList)
        recyclerView.adapter = adapter // Asigna el adapter al RecyclerView
    }
}
