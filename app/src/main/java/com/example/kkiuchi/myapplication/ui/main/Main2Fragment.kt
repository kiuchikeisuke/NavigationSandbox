package com.example.kkiuchi.myapplication.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kkiuchi.myapplication.R

class Main2Fragment:Fragment() {
    companion object {
        fun newInstance() = Main3Fragment()
    }

    private lateinit var viewModel: Main3ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragmenrt3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Main3ViewModel::class.java)
        // TODO: Use the ViewModel
    }
}