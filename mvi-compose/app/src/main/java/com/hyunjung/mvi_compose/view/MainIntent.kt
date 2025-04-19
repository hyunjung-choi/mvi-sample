package com.hyunjung.mvi_compose.view

sealed class MainIntent {

    object FetchAnimals : MainIntent()
}