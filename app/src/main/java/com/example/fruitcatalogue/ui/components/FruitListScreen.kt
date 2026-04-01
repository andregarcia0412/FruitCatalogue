package com.example.fruitcatalogue.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fruitcatalogue.ui.viewmodel.FruitListViewModel
import com.example.fruitcatalogue.ui.viewmodel.FruitViewModel
import kotlinx.serialization.Serializable

@Composable
fun FruitListScreen(navController: NavController) {
    val fruitListViewModel: FruitListViewModel = viewModel()
    val fruits = fruitListViewModel.uiState.collectAsState().value.fruitList ?: emptyList()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Text(
                text = "Lista de Frutas",
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            items(fruits) { fruit ->
                FruitCard(
                    fruit = fruit
                ) {
                    navController.navigate(FruitDetail)
                }
            }
        }
    }
}

@Serializable
object FruitList