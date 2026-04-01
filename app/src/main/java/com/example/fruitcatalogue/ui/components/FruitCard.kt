package com.example.fruitcatalogue.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fruitcatalogue.data.Fruit

@Composable
fun FruitCard(fruit: Fruit, onClick: () -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(6.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        onClick = onClick
    ) {
        Image(
            painter = painterResource(fruit.photo),
            contentDescription = "Imagem da fruta ${fruit.name}",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp, horizontal = 16.dp)
                .size(150.dp)
                .clip(RoundedCornerShape(16.dp)),
        )

        Text(
            text = fruit.name,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        HorizontalDivider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp),

        )

        Text(
            text = fruit.description,
            textAlign = TextAlign.Justify,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 24.dp)
        )
    }
}