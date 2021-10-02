package com.ultimate.ezwash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prototype_car_wash.view.*

class CarWashAdapter(var carWashes: ArrayList<CarWash>) : RecyclerView.Adapter<CarWashPrototype>() {
//    create the prototype (view holder)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarWashPrototype {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prototype_car_wash, parent, false)
        return CarWashPrototype(view)
    }

//    devuelve la cantidad de elementos
    override fun onBindViewHolder(carWashPrototype: CarWashPrototype, position: Int) {
        carWashPrototype.bind(carWashes.get(position))
    }

//    conecta la informacion
    override fun getItemCount(): Int {
        return carWashes.size
    }

}

class CarWashPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName = itemView.tvName
    val tvDescription = itemView.tvDescription

    val cvCarWash = itemView.cvCarWash

    fun bind(carWash: CarWash){
        tvName.text = carWash.name
        tvDescription.text = carWash.description
    }

}


