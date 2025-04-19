package com.hyunjung.mvi_compose.view

import com.hyunjung.mvi_compose.model.Animal

sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Success(val animals: List<Animal>) : MainState()
    data class Error(val message: String) : MainState()
}