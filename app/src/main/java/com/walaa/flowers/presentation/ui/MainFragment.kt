package com.walaa.flowers.presentation.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.walaa.flowers.R
import com.walaa.flowers.data.repositoryImp.FlowerRepositoryImp
import com.walaa.flowers.domain.usecase.FlowerUsecase
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getViewModel().getFlowers.observe(this, Observer {
            txt.text = it.toString()
        })
    }

    fun getViewModel(): MainViewModel {
        return ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(context = context!!, getFlowerUsecase = FlowerUsecase(
                    FlowerRepositoryImp()
                ))as T
            }

        })[MainViewModel::class.java]
    }

}
