package com.bhavin.spinnerloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.loader.LoadingUtils
import com.example.spinnerloader.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showProgress()

    }

    fun hideProgress() {
        LoadingUtils.hideDialog()
        Handler(Looper.getMainLooper()).postDelayed({
            showProgress()
        }, 2000)
    }

    private fun showProgress() {
        LoadingUtils.showDialog(this, false)
        Handler(Looper.getMainLooper()).postDelayed({
            hideProgress()
        }, 5000)
    }
}