package com.andres.comics.login.di

import com.andres.comics.app.di.scopes.PerFragment
import com.andres.comics.login.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by andres.escobar on 9/10/2017.
 */
@Module
abstract class LoginActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(LoginFragmentModule::class))
    internal abstract fun loginFragmentInjector(): LoginFragment

}