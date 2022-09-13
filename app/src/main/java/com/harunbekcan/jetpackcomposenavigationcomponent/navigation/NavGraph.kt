package com.harunbekcan.jetpackcomposenavigationcomponent.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.screens.FavoritesScreen
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.screens.HomeScreen
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.screens.MessagesScreen
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.screens.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController, paddingValues: PaddingValues) {

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.route,
        modifier = Modifier.padding(paddingValues = paddingValues)
    ) {
        composable(route = ScreenRoutes.Home.route) {
            HomeScreen()
        }

        composable(route = ScreenRoutes.Favorites.route) {
            FavoritesScreen()
        }

        composable(route = ScreenRoutes.Messages.route) {
            MessagesScreen()
        }

        composable(route = ScreenRoutes.Profile.route) {
            ProfileScreen()
        }
    }
}