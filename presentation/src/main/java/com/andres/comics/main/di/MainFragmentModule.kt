package com.andres.comics.main.di

import com.andres.comics.main.MainFragment
import com.andres.comics.main.MainPresenter
import com.andres.comics.main.MainPresenterImpl
import com.andres.comics.main.MainView
import dagger.Binds
import dagger.Module

/**
 * Created by andres.escobar on 9/10/2017.
 */
@Module
abstract class MainFragmentModule {

    @Binds
    abstract fun provideMainView(mainFragment: MainFragment) : MainView

    @Binds
    abstract fun provideMainPresenter(mainPresenterImpl: MainPresenterImpl) : MainPresenter
}