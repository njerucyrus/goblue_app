package com.apps.goblue.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apps.goblue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


    }
}