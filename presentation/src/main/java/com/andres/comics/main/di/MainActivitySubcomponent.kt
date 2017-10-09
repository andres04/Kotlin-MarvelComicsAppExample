package com.andres.comics.main.di

import com.andres.comics.main.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by andres.escobar on 9/10/2017.
 */
@Subcomponent(modules =  arrayOf())
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>() {}
}

