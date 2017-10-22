package com.andres.comics.main.di

import com.andres.comics.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.andres.comics.main.MainFragment
import com.andres.comics.app.di.scopes.PerFragment




/**
 * Created by andres.escobar on 9/10/2017.
 */
@Module
abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(MainFragmentModule::class))
    internal abstract fun mainFragmentInjector(): MainFragment

}