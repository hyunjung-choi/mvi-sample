package com.hyunjung.mvi_compose.api

class AnimalRepository(private val api: AnimalApi) {

    suspend fun getAnimals() = api.getAnimals()
}