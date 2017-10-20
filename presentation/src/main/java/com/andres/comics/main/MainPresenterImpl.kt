package com.andres.comics.main

import javax.inject.Inject

/**
 * Created by andres.escobar on 4/10/2017.
 */
class MainPresenterImpl : MainPresenter{

    var mainView : MainView

    @Inject
    constructor(mainView: MainView){
        this.mainView = mainView
    }

    override fun getLol() : String{
        return "LOL";
    }

}