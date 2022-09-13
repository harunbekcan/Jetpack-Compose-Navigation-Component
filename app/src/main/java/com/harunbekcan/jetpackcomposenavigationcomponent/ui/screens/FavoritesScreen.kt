package com.harunbekcan.jetpackcomposenavigationcomponent.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.theme.Blue

@Composable
fun FavoritesScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Text(
                "FAVORITES PAGE", modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = CenterHorizontally)
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 44.sp,
                fontWeight = FontWeight.Bold,
                color = Blue
            )
        }
    }
}