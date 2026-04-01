package com.example.fruitcatalogue.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.fruitcatalogue.data.FruitsDatabase
import com.example.fruitcatalogue.ui.model.FruitDetailState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FruitViewModel: ViewModel() {
    private var _uiState = MutableStateFlow(FruitDetailState())
    val uiState = _uiState.asStateFlow()

    fun getById(fruitId: Int) {
        val fruit = FruitsDatabase.findById(fruitId)

        if(fruit != null) {
            _uiState.update { currentValue ->
                currentValue.copy(
                    fruit = fruit
                )
            }
        }
    }
}