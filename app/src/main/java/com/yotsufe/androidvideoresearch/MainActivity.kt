package com.yotsufe.androidvideoresearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yotsufe.androidvideoresearch.app1.App1Activity
import com.yotsufe.androidvideoresearch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.app1.setOnClickListener {
            startActivity(App1Activity.createIntent(this))
        }

    }
}
