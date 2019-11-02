package com.walaa.flowers.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.walaa.flowers.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        fm.beginTransaction().replace(R.id.frame, MainFragment()).commitAllowingStateLoss()
    }
}
