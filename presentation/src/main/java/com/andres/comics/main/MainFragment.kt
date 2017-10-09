package com.andres.comics.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andres.comics.R
import com.andres.comics.common.BaseFragment
import com.andres.comics.common.BaseView

/**
 * Created by andres.escobar on 4/10/2017.
 */
class MainFragment : BaseFragment(), BaseView{

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}