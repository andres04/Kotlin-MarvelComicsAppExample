package com.andres.comics.main

import android.os.Bundle
import butterknife.ButterKnife
import com.andres.comics.R
import com.andres.comics.common.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        var fragment = MainFragment()
        supportFragmentManager.beginTransaction().replace(R.id.flt_main, fragment).commit()
    }
}
