package com.iftm.aularetrofit

import com.iftm.aularetrofit.dominio.User
import retrofit2.Call
import retrofit2.http.GET


interface ApiEndPoint {
    @GET("users")
    fun obterUsuarios(): Call<List<User>>
}
