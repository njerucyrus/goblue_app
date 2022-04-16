package com.apps.goblue.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apps.goblue.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var mBinding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.btnLogin.setOnClickListener{
            startActivity(Intent(this, SearchTraineeActivity::class.java))
        }

    }
}