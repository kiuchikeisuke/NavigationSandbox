package com.example.kkiuchi.myapplication.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.kkiuchi.myapplication.Main2Activity
import com.example.kkiuchi.myapplication.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        view?.findViewById<Button>(R.id.button_to_fragment2)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_main2Fragment) }
        }
        view?.findViewById<Button>(R.id.button2_to_activity2)?.setOnClickListener {

            /* simple start activity */
//            val intent = Intent(context, Main2Activity::class.java)
//            startActivity(intent)

            /* simple start activity with FLAG_ACTIVITY_SINGLE_TOP */
//            val intent = Intent(context, Main2Activity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
//            startActivity(intent)

            /* simple start activity with animation */
//            val intent = Intent(context, Main2Activity::class.java)
//            startActivity(intent)
//            activity!!.overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out)

            /* start activity with single top flag by Nav */
//            val options = NavOptions.Builder().setLaunchSingleTop(true).build()
//            view?.let { Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_main2Activity, null, options) }


            /* start activity with animation by Nav */
//            val options = NavOptions.Builder()
//                    .setEnterAnim(R.anim.abc_fade_in)
//                    .setExitAnim(R.anim.abc_fade_out)
//                    .build()
//            view?.let { Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_main2Activity, null, options) }

            /* set back stack animation */
//            val options = NavOptions.Builder()
//                    .setPopEnterAnim(R.anim.abc_fade_in)
//                    .setPopExitAnim(R.anim.abc_fade_out)
//                    .build()
//            view?.let { Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_main2Activity, null, options) }

            /* start activity with single top flag and animation by Nav and set back stack animation */
            val options = NavOptions.Builder()
                    .setLaunchSingleTop(true)
                    .setEnterAnim(R.anim.abc_fade_in)
                    .setExitAnim(R.anim.abc_fade_out)
                    .setPopEnterAnim(R.anim.abc_fade_in)
                    .setPopExitAnim(R.anim.abc_fade_out)
                    .setLaunchDocument(true)
                    .setClearTask(true)
                    .build()
            view?.let { Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_main2Activity, null, options) }
        }
    }
}