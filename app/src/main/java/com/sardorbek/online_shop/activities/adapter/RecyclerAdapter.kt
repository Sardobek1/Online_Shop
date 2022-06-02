package com.sardorbek.online_shop.activities.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.sardorbek.online_shop.R

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var title = arrayOf("Nike","Fila","USPolo","Adidas","Gucci","Jordan","Reebok","Vans","Converse","Under Armour")
    var buy = arrayOf("120 $ ","110 $ ","320 $ ","210 $ ","180 $ ","410 $ ","220 $ ","140 $ ","310 $ ","160 $ ")
    var photoes = intArrayOf(R.drawable.nike,R.drawable.adidas,R.drawable.uspolo,R.drawable.gucci,R.drawable.nike,R.drawable.nike,
        R.drawable.nike,R.drawable.nike,R.drawable.nike,R.drawable.nike,)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
       var v = LayoutInflater.from(parent.context).inflate(R.layout.item_rec,parent,false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
     holder.nameis.text = title[position]
        holder.by.text = buy[position]
        holder.rasm.setImageResource(photoes[position])
    }

    override fun getItemCount(): Int {
       return title.size
    }
    inner class ViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
    var nameis : TextView
    var by : TextView
    var rasm : ImageView

    init {
        nameis = itemView.findViewById(R.id.campniy)
        by = itemView.findViewById(R.id.narxi)
        rasm = itemView.findViewById(R.id.rasmi)
    }
    }
}


