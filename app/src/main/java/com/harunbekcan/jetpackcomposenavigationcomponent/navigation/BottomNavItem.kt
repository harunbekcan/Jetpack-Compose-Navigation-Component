package com.harunbekcan.jetpackcomposenavigationcomponent.navigation

import com.harunbekcan.jetpackcomposenavigationcomponent.R
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.CATEGORY_FAVORITES
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.CATEGORY_HOME
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.CATEGORY_MESSAGES
import com.harunbekcan.jetpackcomposenavigationcomponent.utils.Constants.CATEGORY_PROFILE

sealed class BottomNavItem(
    val title: String,
    val image: Int,
    val route: String
) {
    object Home : BottomNavItem(
        title = CATEGORY_HOME,
        image = R.drawable.ic_home,
        route = ScreenRoutes.Home.route
    )

    object Favorites : BottomNavItem(
        title = CATEGORY_FAVORITES,
        image = R.drawable.ic_favorites,
        route = ScreenRoutes.Favorites.route
    )

    object Messages : BottomNavItem(
        title = CATEGORY_MESSAGES,
        image = R.drawable.ic_messages,
        route = ScreenRoutes.Messages.route
    )

    object Profile : BottomNavItem(
        title = CATEGORY_PROFILE,
        image = R.drawable.ic_profile,
        route = ScreenRoutes.Profile.route
    )
}