package com.yjdev.scrollapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yjdev.scrollapp.databinding.ItemVacanteBinding

class VacanteAdapter(val vacante: List<Vacante>):RecyclerView.Adapter<VacanteAdapter.VacanteHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VacanteHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VacanteHolder(layoutInflater.inflate(R.layout.item_vacante, parent, false))
    }

    override fun onBindViewHolder(holder: VacanteHolder, position: Int) {
        /***
         * holder es una instancia de la clase VacanteHolder,
         * la cual manda el elemento actual a renderizar en el metodo render
         * que recibe una vacante
         */
        holder.render(vacante[position])
    }

    override fun getItemCount(): Int {
        return vacante.size
    }

    class VacanteHolder(val view: View):RecyclerView.ViewHolder(view){

        val binding = ItemVacanteBinding.bind(view)
        fun render(vacante:Vacante){
            binding.tvPuesto.text = vacante.puesto
            binding.tvEmpresa.text = vacante.empresa
            binding.tvSueldo.text = vacante.sueldo
        }
    }
}