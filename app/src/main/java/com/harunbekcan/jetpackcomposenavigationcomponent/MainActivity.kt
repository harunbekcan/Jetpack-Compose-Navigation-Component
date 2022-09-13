package com.harunbekcan.jetpackcomposenavigationcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.harunbekcan.jetpackcomposenavigationcomponent.navigation.BottomNavigationBar
import com.harunbekcan.jetpackcomposenavigationcomponent.navigation.NavGraph
import com.harunbekcan.jetpackcomposenavigationcomponent.navigation.ScreenRoutes
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.theme.Blue
import com.harunbekcan.jetpackcomposenavigationcomponent.ui.theme.JetpackComposeNavigationComponentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationComponentTheme {
                val bottomBarState = rememberSaveable { (mutableStateOf(false)) }

                val navController = rememberNavController()

                val navBackStackEntry by navController.currentBackStackEntryAsState()

                Scaffold(
                    backgroundColor = Blue,
                    bottomBar = { BottomNavigationBar(navController, bottomBarState) }
                ){}
            }
        }
    }
}