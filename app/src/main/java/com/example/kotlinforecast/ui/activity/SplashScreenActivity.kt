package com.example.kotlinforecast.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.bumptech.glide.Glide
import com.example.kotlinforecast.R
import com.example.kotlinforecast.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_anim)

        binding.imageView.startAnimation(topAnimation)
        Glide.with(this).load(R.drawable.weathergif).into(binding.imageView)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}