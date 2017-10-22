package com.andres.comics.main

import com.andres.comics.app.di.scopes.PerFragment
import javax.inject.Inject

/**
 * Created by andres.escobar on 4/10/2017.
 */
@PerFragment
class MainPresenter {

    @Inject
    constructor(){

    }

     fun getLol() : String{
        return "LOL";
}

}