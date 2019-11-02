package com.walaa.flowers.data.repositoryImp


import com.walaa.flowers.domain.model.ListOfFlowers
import com.walaa.flowers.domain.repositoryInterface.FlowersRepository
import com.walaa.flowers.utils.ApiUtils
import io.reactivex.Single

class FlowerRepositoryImp: FlowersRepository {
    override fun getAllFlowers(): Single<ListOfFlowers> {
        return ApiUtils.apiService.getAllFlowers()
    }


}