package com.apps.goblue.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apps.goblue.R
import com.apps.goblue.databinding.ActivityUpdatePlacementBinding

class UpdatePlacementActivity : AppCompatActivity() {
    lateinit var mBinding:ActivityUpdatePlacementBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityUpdatePlacementBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


    }
}