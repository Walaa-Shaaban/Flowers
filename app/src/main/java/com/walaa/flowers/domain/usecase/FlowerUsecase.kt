package com.walaa.flowers.domain.usecase


import com.walaa.flowers.data.repositoryImp.FlowerRepositoryImp
import com.walaa.flowers.domain.model.ListOfFlowers
import com.walaa.flowers.domain.usecase.base.SingleUseCase
import io.reactivex.Single

class FlowerUsecase(private val repository: FlowerRepositoryImp) : SingleUseCase<ListOfFlowers>() {
    override fun buildUseCaseSingle(): Single<ListOfFlowers> {
        return  repository.getAllFlowers()
    }


}