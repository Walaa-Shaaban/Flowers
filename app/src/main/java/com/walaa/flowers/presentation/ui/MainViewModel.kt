package com.walaa.flowers.presentation.ui

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.walaa.flowers.domain.model.ListOfFlowers
import com.walaa.flowers.domain.usecase.FlowerUsecase

class MainViewModel(private val getFlowerUsecase: FlowerUsecase, private val context: Context) : ViewModel() {

     var getFlowers  = MutableLiveData<ListOfFlowers>()
    init {
        loadFlowers()
    }

    fun loadFlowers(){
        getFlowerUsecase.execute(
            onSuccess = {
                getFlowers.value = it
            },
            onError = {
                Log.e(it.message ,"@")
                Toast.makeText(context, it.message, Toast.LENGTH_LONG).show()
            }

        )
    }
}
