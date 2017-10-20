package com.andres.comics.main

import android.app.Fragment
import android.os.Bundle
import butterknife.ButterKnife
import com.andres.comics.R
import com.andres.comics.common.BaseActivity
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import dagger.android.AndroidInjector
import dagger.android.HasFragmentInjector


class MainActivity : BaseActivity(), HasFragmentInjector {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        var fragment = MainFragment()
        fragmentManager.beginTransaction().replace(R.id.flt_main, fragment).commit()
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }

}
