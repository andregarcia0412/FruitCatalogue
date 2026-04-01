package com.example.fruitcatalogue.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fruitcatalogue.data.Fruit
import com.example.fruitcatalogue.ui.viewmodel.FruitViewModel
import kotlinx.serialization.Serializable

@Composable
fun FruitDetailScreen(navController: NavController, fruitId: Int) {

    val fruitViewModel: FruitViewModel = viewModel()
    fruitViewModel.getById(fruitId)
    val fruitState = fruitViewModel.uiState.collectAsState().value.fruit

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() { navController.popBackStack() } }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text(
                text = "This is ${fruitState?.name}"
            )
        }
    }
}

@Serializable
data class FruitDetail(val fruitId: Int)