package com.apps.goblue.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apps.goblue.R
import com.apps.goblue.databinding.ActivitySearchTraineeBinding

class SearchTraineeActivity : AppCompatActivity() {
    lateinit var mBinding: ActivitySearchTraineeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySearchTraineeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnUpdatePlacement.setOnClickListener{
            startActivity(Intent(this, SearchTraineeActivity::class.java))
        }
    }
}