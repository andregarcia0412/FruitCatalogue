package com.example.fruitcatalogue.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(onReturn: () -> Unit) {
    TopAppBar(
        title = {},
        navigationIcon = {
            IconButton(onClick = onReturn) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Voltar")
            }
        }
    )
}