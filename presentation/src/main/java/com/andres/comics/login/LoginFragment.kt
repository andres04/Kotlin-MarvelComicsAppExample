package com.andres.comics.login

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.andres.comics.R
import com.andres.comics.common.BaseFragment
import dagger.android.AndroidInjection
import javax.inject.Inject


/**
 * Created by andres.escobar on 4/10/2017.
 */
class LoginFragment : BaseFragment(), LoginView {

    @Inject
    lateinit var loginPresenter: LoginPresenter

    @Suppress("OverridingDeprecatedMember")
    override fun onAttach(activity: Activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // Perform injection here before M, L (API 22) and below because onAttach(Context)
            // is not yet available at L.
            AndroidInjection.inject(this)
        }
        super.onAttach(activity)
    }

    override fun onAttach(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Perform injection here for M (API 23) due to deprecation of onAttach(Activity).
            AndroidInjection.inject(this)
        }
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginPresenter.getLol()
    }

    /************/

    override fun onLol(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

}