package com.example.companiescompose.data.retrofit

import com.example.companiescompose.data.models.Company
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface  ApiService {

    @GET("test.php")
    fun getCompany(@Query("id") id: Int): Response<ResponseBody>

    @GET("test.php/")
    suspend fun getListCompanies(): Response<List<Company>>

}