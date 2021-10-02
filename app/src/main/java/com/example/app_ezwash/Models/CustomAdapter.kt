package com.example.app_ezwash.Models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_ezwash.R
import kotlinx.android.synthetic.main.fragment_mycars.view.*

import org.w3c.dom.Text


class CustomAdapter(items:ArrayList<CarsUser>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    var items: ArrayList<CarsUser>? =null
    var viewHolder: ViewHolder?= null
    init{
        this.items=items
    }

    //envia
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
     val view= LayoutInflater.from(parent?.context).inflate(R.layout.fragment_mycars,parent, false   )
        viewHolder= ViewHolder(view)
        return viewHolder!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item= items?.get(position)
        holder.name?.text=item?.name
        holder.photo?.setImageResource(item?.photo!!)
    }
    //retornar
    override fun getItemCount(): Int {
        return this.items?.count()!!
    }

    //clase interna
    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        var view= itemView
        var photo : ImageView?=null
        var name : TextView?=null

        //insertar var
        init{
            view.imageViewPhoto
            photo  = view.imageViewPhoto
            name= view.textViewCarName
        }
    }
}