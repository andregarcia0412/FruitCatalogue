package com.example.fruitcatalogue.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fruitcatalogue.data.Fruit
import com.example.fruitcatalogue.ui.viewmodel.FruitViewModel
import kotlinx.serialization.Serializable

@Composable
fun FruitDetailScreen(navController: NavController, fruitId: Int) {

    val fruitViewModel: FruitViewModel = viewModel()
    fruitViewModel.getById(fruitId)
    val fruitState = fruitViewModel.uiState.collectAsState().value.fruit ?: return

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFFF1F8E9),
        topBar = { TopBar() { navController.popBackStack() } }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painterResource(fruitState.photo),
                contentDescription = "Imagem da fruta ${fruitState.name}",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(150.dp)
            )
            Text(
                text = fruitState.name,
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            )

            HorizontalDivider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp),

                )

            Text(
                text = fruitState.description,
                textAlign = TextAlign.Justify,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            )
        }
    }
}

@Serializable
data class FruitDetail(val fruitId: Int)