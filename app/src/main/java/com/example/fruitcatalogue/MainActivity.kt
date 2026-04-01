package com.example.fruitcatalogue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.toRoute
import com.example.fruitcatalogue.ui.components.FruitDetail
import com.example.fruitcatalogue.ui.components.FruitDetailScreen
import com.example.fruitcatalogue.ui.components.FruitList
import com.example.fruitcatalogue.ui.components.FruitListScreen
import com.example.fruitcatalogue.ui.theme.FruitCatalogueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FruitCatalogueTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = FruitList
                ) {
                    composable<FruitList> {
                        FruitListScreen(navController)
                    }

                    composable<FruitList> { backStackTrace ->
                        val fruitId: Int = backStackTrace.toRoute()
                        FruitDetailScreen(navController, fruitId)
                    }
                }
            }
        }
    }
}