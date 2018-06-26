package com.example.kkiuchi.myapplication.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.kkiuchi.myapplication.R

class Main2Fragment : Fragment() {

    companion object {
        fun newInstance() = Main2Fragment()
    }

    private lateinit var viewModel: Main2ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Main2ViewModel::class.java)
        // TODO: Use the ViewModel
        view?.findViewById<Button>(R.id.button_deeplink)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.deeplink)}
        }
        view?.findViewById<Button>(R.id.button_to_main)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.action_main2Fragment2_to_mainActivity2)}
        }
        view?.findViewById<Button>(R.id.button_to_fragment)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.action_main2Fragment_to_mainFragment2)}
        }

    }
}