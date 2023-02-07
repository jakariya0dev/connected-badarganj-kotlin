package com.brainstorm21.connectedbadarganj

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView


class FragmentDashboard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        view.findViewById<CardView>(R.id.btn_administration).setOnClickListener{

            val fm = parentFragmentManager.beginTransaction()
            fm.replace(R.id.fragment_container, FragmentAdministration())
            fm.commit()
            //Toast.makeText(it.context, "Administration", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<CardView>(R.id.btn_leader).setOnClickListener{

            val fm = parentFragmentManager.beginTransaction()
            fm.replace(R.id.fragment_container, FragmentLeaders())
            fm.commit()
            //Toast.makeText(it.context, "Administration", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}