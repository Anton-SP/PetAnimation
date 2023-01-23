package com.example.petanimation


import android.animation.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.petanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding: ActivityMainBinding by viewBinding()
    private lateinit var rocket: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initImage()

    }


    private fun initImage() {
        rocket = binding.rocket
        rocket.setOnClickListener { view ->
            fly()

        }
    }

    private fun fly() {

        val animator = ObjectAnimator.ofFloat(rocket, View.ROTATION, -360f, 0f)
        animator.duration = 1000
        animator.start()
    }


}