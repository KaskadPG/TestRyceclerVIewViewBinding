package ru.dgu.testryceclerviewviewbinding.networking

object RetrofitBuilder {

    private val BASE_URL = "https://hoff.ru/api/v2/"
    val retrofitService: MarvelService
        get() = RetrofitClient
            .getClient(BASE_URL)
            .create(MarvelService::class.java)
}