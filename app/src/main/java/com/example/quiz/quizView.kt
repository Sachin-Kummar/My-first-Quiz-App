package com.example.quiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import java.util.ArrayList

class quizView : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_quiz_view, container, false)


        // Layout Fields
        val quizTitle = rootView.findViewById<TextView>(R.id.quizTitle)
        val qus1 = rootView.findViewById<TextView>(R.id.yourQuestion)
        val ops1 = rootView.findViewById<CheckBox>(R.id.op1)
        val ops2 = rootView.findViewById<CheckBox>(R.id.op2)
        val ops3 = rootView.findViewById<CheckBox>(R.id.op3)
        val ops4 = rootView.findViewById<CheckBox>(R.id.op4)
        val submit = rootView.findViewById<MaterialButton>(R.id.subBtn)

        // Receive data from homeScreen Fragment
        val quizType = arguments?.getString("title")
        val Qus = arguments?.getString("Qus")
        val op1 = arguments?.getString("op1")
        val op2 = arguments?.getString("op2")
        val op3 = arguments?.getString("op3")
        val op4 = arguments?.getString("op4")

        // Set data in fragment_quiz_view layout fields
        quizTitle?.text = quizType
        qus1?.text = Qus
        ops1?.text = op1
        ops2?.text = op2
        ops3?.text = op3
        ops4?.text = op4


        // Conditions
        submit.setOnClickListener {
            if(ops2.isChecked == true){
                Toast.makeText(requireActivity(),"You are Right!",Toast.LENGTH_LONG)
                    .show()
            }else{
                Toast.makeText(requireActivity(),"You are wrong",Toast.LENGTH_LONG).show()
            }
        }


        return rootView
    }
}