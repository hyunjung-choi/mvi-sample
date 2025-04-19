package com.hyunjung.mvi_compose.api

import com.hyunjung.mvi_compose.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}