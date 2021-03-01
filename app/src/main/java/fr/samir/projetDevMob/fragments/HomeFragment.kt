package fr.samir.projetDevMob.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.samir.projetDevMob.R
import fr.samir.projetDevMob.adapter.ThemesAdapter

class HomeFragment : Fragment() {
    //
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_home,container, false)

        val themesRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_themes)
        themesRecyclerView.adapter=ThemesAdapter()

        return view
    }
}