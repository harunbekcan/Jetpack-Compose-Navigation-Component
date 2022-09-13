package com.harunbekcan.jetpackcomposenavigationcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.compose.rememberNavController
import com.harunbekcan.jetpackcomposenavigationcomponent.navigation.BottomNavigationBar
import com.harunbekcan.jetpackcomposenavigationcomponent.navigation.NavGraph
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.theme.Blue
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.theme.JetpackComposeNavigationComponentTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeNavigationComponentTheme {

                val bottomBarState = rememberSaveable { (mutableStateOf(true)) }

                val navController = rememberNavController()

                Scaffold(
                    backgroundColor = Blue,
                    bottomBar = { BottomNavigationBar(navController, bottomBarState) }
                ){
                    NavGraph(navController = navController , paddingValues = it )
                }
            }
        }
    }
}