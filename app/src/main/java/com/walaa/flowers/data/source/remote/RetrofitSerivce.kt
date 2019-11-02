package com.walaa.flowers.data.source.remote

import androidx.lifecycle.LiveData
import com.walaa.flowers.domain.model.ListOfFlowers
import io.reactivex.Single
import retrofit2.http.GET

interface RetrofitSerivce{

    @GET ("flowers.json")
    fun getAllFlowers() : Single<ListOfFlowers>

}