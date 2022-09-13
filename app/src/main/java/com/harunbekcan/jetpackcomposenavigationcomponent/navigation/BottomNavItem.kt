package com.harunbekcan.jetpackcomposenavigationcomponent.navigation

import com.harunbekcan.jetpackcomposenavigationcomponent.R
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.CATEGORY_FAVORITES
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.CATEGORY_HOME
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.MESSAGES_SCREEN
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.PROFILE_SCREEN

sealed class BottomNavItem(
    val title: String,
    val image: Int,
    val route: String
) {
    object Home : BottomNavItem(
        title = CATEGORY_HOME,
        image = R.drawable.ic_home,
        route = ScreenRoutes.HomeScreen.route
    )

    object Favorites : BottomNavItem(
        title = CATEGORY_FAVORITES,
        image = R.drawable.ic_favorites,
        route = ScreenRoutes.FavoritesScreen.route
    )

    object Messages : BottomNavItem(
        title = MESSAGES_SCREEN,
        image = R.drawable.ic_messages,
        route = ScreenRoutes.MessagesScreen.route
    )

    object Profile : BottomNavItem(
        title = PROFILE_SCREEN,
        image = R.drawable.ic_profile,
        route = ScreenRoutes.ProfileScreen.route
    )
}