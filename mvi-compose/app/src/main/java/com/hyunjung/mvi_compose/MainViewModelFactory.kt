package com.hyunjung.mvi_compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hyunjung.mvi_compose.api.AnimalApi
import com.hyunjung.mvi_compose.api.AnimalRepository

class MainViewModelFactory(private val api: AnimalApi) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(AnimalRepository(api)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}