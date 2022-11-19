package com.redyesncode.composecommerce.bottomNavigation

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.*

@Composable
fun BottomNavigation(navController: NavController){
    val items = listOf(
        BottomNavItems.Orders,
        BottomNavItems.Home,
        BottomNavItems.Profile

    )
    androidx.compose.material.BottomNavigation(backgroundColor = Color(252,29,92), contentColor = Color.White) {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.itemIcon), contentDescription = item.ItemTitle) },
                label = { Text(text = item.ItemTitle,
                    fontSize = 9.sp) },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.screenRouteName,
                onClick = {
                    navController.navigate(item.screenRouteName) {

                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }



}