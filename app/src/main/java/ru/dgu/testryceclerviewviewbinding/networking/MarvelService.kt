package ru.dgu.testryceclerviewviewbinding.networking

import retrofit2.Call
import retrofit2.http.GET
import ru.dgu.testryceclerviewviewbinding.ModelMebel

interface MarvelService {

    @GET("get_products_new?category_id=320&sort_by=popular&sort_type=desc&limit=40&offset=0&device_id=3a7612bcc84813b5&isAndroid=true&app_version=1.8.16&location=19&xhoff=36f40b3d665cdb9435904796172dde5e3f13aa8a%3A4630")
    fun getMovieList(): Call<MutableList<ModelMebel.Item>>

}