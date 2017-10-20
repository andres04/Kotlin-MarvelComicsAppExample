package com.andres.comics.main.di

import com.andres.comics.main.MainFragment
import com.andres.comics.main.MainView
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by andres.escobar on 9/10/2017.
 */
@Subcomponent(modules =  arrayOf())
interface MainFragmentSubcomponent : AndroidInjector<MainFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainFragment>() {}

    fun inject(mainView: MainView)

}