package com.andres.comics.app.di

import com.andres.comics.app.App
import com.andres.comics.main.di.MainActivityModule
import com.andres.comics.main.di.MainFragmentModule
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by andres.escobar on 9/10/2017.
 */

@Component(modules = arrayOf(
        AndroidInjectionModule::class
        , MainActivityModule::class
        , MainFragmentModule::class
        )
)
interface AppComponent {
    fun inject(app: App);
}