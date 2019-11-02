package com.walaa.flowers.utils

import com.walaa.flowers.data.source.remote.RetrofitSerivce
import com.walaa.flowers.data.source.remote.RetrofitTFlowers

object ApiUtils {

    val BASE_URL = "https://gist.githubusercontent.com/sandeepcmsm/2e1f5762fa5ca351d8f129e73c730071/raw/30fb98f124445596a2a96f60a233ab13d07167d0/"

    val apiService: RetrofitSerivce = RetrofitTFlowers.getClient()?.create(RetrofitSerivce::class.java)!!
}