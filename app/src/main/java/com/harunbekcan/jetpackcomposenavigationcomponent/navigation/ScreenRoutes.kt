package com.harunbekcan.jetpackcomposenavigationcomponent.navigation

import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.FAVORITES_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.HOME_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.MESSAGES_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.PROFILE_SCREEN

sealed class ScreenRoutes(val route : String) {
    object Home : ScreenRoutes(HOME_SCREEN)
    object Favorites : ScreenRoutes(FAVORITES_SCREEN)
    object Messages : ScreenRoutes(MESSAGES_SCREEN)
    object Profile : ScreenRoutes(PROFILE_SCREEN)
}