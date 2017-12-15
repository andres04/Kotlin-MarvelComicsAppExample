package com.andres.comics.login

import com.andres.comics.app.di.scopes.PerFragment
import javax.inject.Inject

/**
 * Created by andres.escobar on 4/10/2017.
 */
@PerFragment
class LoginPresenterImpl : LoginPresenter {

    var loginView: LoginView

    @Inject
    constructor(loginView: LoginView){
        this.loginView = loginView
    }

    override fun getLol() {
        loginView.onLol("LOL!!!!!")
    }

}