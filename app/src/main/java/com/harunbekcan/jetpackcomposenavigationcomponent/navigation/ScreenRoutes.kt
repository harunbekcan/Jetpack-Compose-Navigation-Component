package com.harunbekcan.jetpackcomposenavigationcomponent.navigation

import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.FAVORITES_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.HOME_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.MESSAGES_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.PROFILE_SCREEN

sealed class ScreenRoutes(val route : String) {
    object HomeScreen : ScreenRoutes(HOME_SCREEN)
    object FavoritesScreen : ScreenRoutes(FAVORITES_SCREEN)
    object MessagesScreen : ScreenRoutes(MESSAGES_SCREEN)
    object ProfileScreen : ScreenRoutes(PROFILE_SCREEN)
}