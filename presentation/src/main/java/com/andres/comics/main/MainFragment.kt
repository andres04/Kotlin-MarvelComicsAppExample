package com.andres.comics.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andres.comics.R
import com.andres.comics.common.BaseFragment
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by andres.escobar on 4/10/2017.
 */
class MainFragment : BaseFragment(), MainView{

    @Inject
    lateinit var mainPresenter : MainPresenter

    override fun onAttach(context: Context?) {
        AndroidInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("OUTPUT", mainPresenter.getLol())
    }

}