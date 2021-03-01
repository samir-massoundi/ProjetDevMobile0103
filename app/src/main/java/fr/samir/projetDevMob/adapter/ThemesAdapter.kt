package fr.samir.projetDevMob.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.samir.projetDevMob.R

class ThemesAdapter :RecyclerView.Adapter<ThemesAdapter.ViewHolder>(){

    //contiendra touts les composants à controler
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {
        val themeImage = view.findViewById<ImageView>(R.id.image_theme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemesAdapter.ViewHolder {
        val viewOnCreate = LayoutInflater.from(parent.context).inflate(R.layout.item_list_themes, parent, false)
        return ViewHolder(viewOnCreate)
    }

    override fun onBindViewHolder(holder: ThemesAdapter.ViewHolder, position: Int) {    }

    override fun getItemCount(): Int {
       return 3
    }

}