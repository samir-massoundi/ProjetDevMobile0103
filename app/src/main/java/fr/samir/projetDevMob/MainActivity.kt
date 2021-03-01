package fr.samir.projetDevMob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.samir.projetDevMob.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Injection du fragment
        val transact= supportFragmentManager.beginTransaction()
        transact.replace(R.id.fragmentContainer, HomeFragment())
        transact.addToBackStack(null)
        transact.commit()
    }
}