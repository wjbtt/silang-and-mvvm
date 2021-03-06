package me.study.silang.repository

import io.reactivex.Observable
import me.study.silang.bean.Param
import me.study.silang.bean.Rest
import me.study.silang.model.UserData
import me.study.silang.model.UserInfo
import okhttp3.MultipartBody
import retrofit2.http.*

interface MeRepository  {
    @Multipart
    @POST("file/upload")
    fun upload(@PartMap param: Map<String,String>, @Part files: List<MultipartBody.Part>): Observable<Rest<String>>

    @FormUrlEncoded
    @PUT("user/swap-head")
    fun update(@FieldMap param: Param): Observable<Rest<String>>
    @GET("user/by-id")
    fun getUserInfo(): Observable<Rest<UserInfo>>
    @GET("user/get-data")
    fun getUserData(): Observable<Rest<UserData>>
}