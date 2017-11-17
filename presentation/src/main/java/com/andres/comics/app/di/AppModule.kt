package com.andres.comics.app.di

import com.andres.comics.app.di.scopes.PerActivity
import com.andres.comics.login.LoginActivity
import com.andres.comics.login.di.LoginActivityModule
import com.andres.comics.main.MainActivity
import com.andres.comics.main.di.MainActivityModule
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector

/**
 * Created by andres.escobar on 9/10/2017.
 */
@Module(includes = arrayOf(AndroidInjectionModule::class))
abstract class AppModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun mainActivityInjector() : MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(LoginActivityModule::class))
    internal abstract fun loginActivityInjector() : LoginActivity

}