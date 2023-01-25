package com.yotsufe.androidvideoresearch.app1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yotsufe.androidvideoresearch.R
import com.yotsufe.androidvideoresearch.databinding.ActivityApp1Binding

class App1Activity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context) = Intent(context, App1Activity::class.java)
    }

    private lateinit var binding: ActivityApp1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_app1)
    }
}
