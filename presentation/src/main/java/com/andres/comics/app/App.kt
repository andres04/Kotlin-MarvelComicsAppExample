package com.andres.comics.app

import android.app.Activity
import android.app.Application
import com.andres.comics.app.di.DaggerAppComponent
//import com.andres.comics.main.di.DaggerMainComponent
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject



/**
 * Created by andres.escobar on 9/10/2017.
 */
class App : Application(), HasActivityInjector{

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }


}