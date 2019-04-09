package me.study.silang.repository

import io.reactivex.Observable
import me.study.silang.bean.Param
import me.study.silang.bean.Rest
import me.study.silang.entity.Post
import me.study.silang.model.PostModel
import okhttp3.MultipartBody
import retrofit2.http.*

interface BBSRepository {


    @GET("post")
    fun list(@QueryMap param: Param):Observable<Rest<List<PostModel>>>
}