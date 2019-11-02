package com.walaa.flowers.domain.repositoryInterface


import com.walaa.flowers.domain.model.ListOfFlowers
import io.reactivex.Single

interface FlowersRepository {

    fun getAllFlowers() : Single<ListOfFlowers>
}