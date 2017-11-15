package com.andres.comics.main

import com.andres.comics.app.di.scopes.PerFragment
import javax.inject.Inject

/**
 * Created by andres.escobar on 4/10/2017.
 */
@PerFragment
class MainPresenterImpl : MainPresenter{

    var mainView : MainView

    @Inject
    constructor(mainView : MainView){
        this.mainView = mainView
    }

    override fun getLol() {
        mainView.onLol("LOL!!!!!")
    }

}