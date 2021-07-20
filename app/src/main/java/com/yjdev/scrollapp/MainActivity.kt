package com.yjdev.scrollapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yjdev.scrollapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val vacantes = listOf(
        Vacante("Front End Developer", "$15,000", "CazaChambas"),
        Vacante("Backend Dev", "$32,000", "Cazachambas"),
        Vacante("Front End Developer", "$15,000", "CazaChambas"),
        Vacante("Backend Dev", "$32,000", "Cazachambas"),
        Vacante("Front End Developer", "$15,000", "CazaChambas"),
        Vacante("Backend Dev", "$32,000", "Cazachambas"),
        Vacante("Front End Developer", "$15,000", "CazaChambas"),
        Vacante("Backend Dev", "$32,000", "Cazachambas"),
        Vacante("Front End Developer", "$15,000", "CazaChambas"),
        Vacante("Backend Dev", "$32,000", "Cazachambas"),



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()

    }
    private fun initRecycler(){
        binding.rvVacantes.layoutManager = LinearLayoutManager(this)
        val adapter = VacanteAdapter(vacantes)
        binding.rvVacantes.adapter = adapter
    }
}