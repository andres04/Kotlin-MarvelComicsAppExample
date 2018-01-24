package com.andres.comics.login.di

import com.andres.comics.login.LoginFragment
import com.andres.comics.login.LoginPresenter
import com.andres.comics.login.LoginPresenterImpl
import com.andres.comics.login.LoginView
import dagger.Binds
import dagger.Module

/**
 * Created by andres.escobar on 9/10/2017.
 */
@Module
abstract class LoginFragmentModule {

    @Binds
    abstract fun provideLoginView(loginFragment: LoginFragment) : LoginView

    @Binds
    abstract fun provideLoginPresenter(mainPresenterImpl: LoginPresenterImpl) : LoginPresenter
}