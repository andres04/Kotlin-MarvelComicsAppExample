package com.andres.comics.app.di

import com.andres.comics.app.App
import dagger.Component
import javax.inject.Singleton

/**
 * Created by andres.escobar on 9/10/2017.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class)
)
interface AppComponent {
    fun inject(app: App);
}