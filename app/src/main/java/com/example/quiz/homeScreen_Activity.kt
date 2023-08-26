package com.example.quiz

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.FrameLayout
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class homeScreen: Fragment() {



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.home,container,false)

        //checkbox
        val ops1 = rootView.findViewById<CheckBox>(R.id.op1)
        val ops2 = rootView.findViewById<CheckBox>(R.id.op2)
        val ops3 = rootView.findViewById<CheckBox>(R.id.op3)
        val ops4 = rootView.findViewById<CheckBox>(R.id.op4)

        // CardView
        val onGK = rootView.findViewById<CardView>(R.id.onClickGk)
        val onEdu = rootView.findViewById<CardView>(R.id.onClickEdu)
        val onMath = rootView.findViewById<CardView>(R.id.onClickMath)
        val onSci = rootView.findViewById<CardView>(R.id.onClickSci)
        val onWorld = rootView.findViewById<CardView>(R.id.onClickWorld)
        val onCom = rootView.findViewById<CardView>(R.id.onClickCom)

        onGK.setOnClickListener {

            val bundle = Bundle().apply {
                putString("title","G.K")
                putString("Qus","What is the capital of India?")
                putString("op1","Agra")
                putString("op2","Delhi")
                putString("op3","Patna")
                putString("op4","Mumbai")

            }
            val frag = quizView()
            frag.arguments = bundle

            replaceFragment(frag)

        }
        onEdu.setOnClickListener {
            val bundle = Bundle().apply {
                putString("title","Education")
                putString("Qus","What is the source of education?")
                putString("op1","Bus Stand")
                putString("op2","School")
                putString("op3","Railway")
                putString("op4","Cinema")
            }

            val frag = quizView()
            frag.arguments = bundle

            replaceFragment(frag)

        }
        onMath.setOnClickListener {
            val bundle = Bundle().apply {
                putString("title","Mathematics")
                putString("Qus","Who is the genius of maths?")
                putString("op1","tesla")
                putString("op2","Enstein")
                putString("op3","Modi")
                putString("op4","Ramanujan")
            }

            val frag = quizView()
            frag.arguments = bundle

            replaceFragment(frag)
        }
        onSci.setOnClickListener {
            val bundle = Bundle().apply {
                putString("title","Science")
                putString("Qus","Who is the genius of physics?")
                putString("op1","Ramanujan")
                putString("op2","Tesla")
                putString("op3","Modi")
                putString("op4","Enstein")
            }

            val frag = quizView()
            frag.arguments = bundle

            replaceFragment(frag)
        }
        onCom.setOnClickListener {
            val bundle = Bundle().apply {
                putString("title","Commerce")
                putString("Qus","Name of World famous company?")
                putString("op1","Facebook")
                putString("op2","Amazon")
                putString("op3","Insta")
                putString("op4","Flipkart")
            }

            val frag = quizView()
            frag.arguments = bundle

            replaceFragment(frag)
        }
        onWorld.setOnClickListener {
            val bundle = Bundle().apply {
                putString("title","World Affairs")
                putString("Qus","What is the budget of ISRO for Chandrayan?")
                putString("op1","100cr")
                putString("op2","600cr")
                putString("op3","1600cr")
                putString("op4","50cr")
            }

            val frag = quizView()
            frag.arguments = bundle

            replaceFragment(frag)
        }

        return rootView
    }
    fun replaceFragment(frag: Fragment){
        val fragmanager = fragmentManager
        val fragtrans = fragmanager?.beginTransaction()
        fragtrans?.replace(R.id.frameLayout, frag)
        fragtrans?.addToBackStack(null)
        fragtrans?.commit()

    }

}