package com.example.fruitcatalogue.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.fruitcatalogue.data.FruitsDatabase
import com.example.fruitcatalogue.ui.model.FruitListState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FruitListViewModel: ViewModel() {
    private var _uiState = MutableStateFlow(FruitListState())
    val uiState = _uiState.asStateFlow()

    init {
        loadFruitList()
    }

    private fun loadFruitList() {
        val fruitList = FruitsDatabase.findAll()

        _uiState.update { currentState ->
            currentState.copy(
                fruitList = fruitList
            )
        }
    }
}