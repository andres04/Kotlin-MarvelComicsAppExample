package com.andres.comics.main.di

import android.app.Activity
import android.app.Fragment
import com.andres.comics.main.MainActivity
import com.andres.comics.main.MainFragment
import com.andres.comics.main.MainPresenter
import com.andres.comics.main.MainPresenterImpl
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap
import javax.inject.Singleton

/**
 * Created by andres.escobar on 9/10/2017.
 */
@Module(subcomponents = arrayOf(MainFragmentSubcomponent::class))
abstract class MainFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    internal abstract fun bindMainFragmentInjectorFactory(builder: MainFragmentSubcomponent.Builder): AndroidInjector.Factory<out Fragment>

    @Binds
    @Singleton
    abstract fun providesMainPresenter(mainPresenterImpl: MainPresenterImpl) : MainPresenter

}