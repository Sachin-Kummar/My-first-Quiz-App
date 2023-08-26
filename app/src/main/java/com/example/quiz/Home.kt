package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // hinding action bar
        supportActionBar?.hide()

        val bottom = findViewById<BottomNavigationView>(R.id.bottomnav)

        // default
        replaceFragment(homeScreen())

        bottom.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home1 -> replaceFragment(homeScreen())
                R.id.person1 -> replaceFragment(person())
                R.id.notify1 -> replaceFragment(notify_activity())
                else -> {
                }
            }
            true
        }

    }

    fun replaceFragment(frag: Fragment){
        val fragmanager = supportFragmentManager
        val fragtrans = fragmanager.beginTransaction()
        fragtrans.replace(R.id.frameLayout, frag)
        fragtrans.commit()
    }




}

