package com.walaa.flowers.domain.model


import com.google.gson.annotations.SerializedName

data class ListOfFlowers(
    @SerializedName("flowerlist")
    val flowerlist: List<Flowerlist>
)