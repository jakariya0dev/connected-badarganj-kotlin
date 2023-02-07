package com.brainstorm21.connectedbadarganj

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentLeaders : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_leaders, container, false)

        val rv = view.findViewById<RecyclerView>(R.id.rv_leaders)
        rv.layoutManager = LinearLayoutManager(view.context)
        rv.adapter = AdapterForRecyclerView()
        return view
    }

}