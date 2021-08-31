package com.example.firstmvvmcleanarc.adduser.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firstmvvmcleanarc.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val addBtn = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)

        addBtn.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }


        return view
    }


}