package com.andres.comics.login

import android.app.Fragment
import android.os.Bundle
import com.andres.comics.R
import com.andres.comics.common.BaseActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject


class LoginActivity : BaseActivity(), HasFragmentInjector {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var fragment = LoginFragment()
        fragmentManager.beginTransaction().replace(R.id.flt_login, fragment).commit()
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }

}
