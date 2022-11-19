package com.redyesncode.composecommerce.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraphCustom(navHostController: NavHostController){
    NavHost(navHostController, startDestination = BottomNavItems.Home.screenRouteName) {
        composable(BottomNavItems.Orders.screenRouteName) {
            OrdersNavigationScreen()
        }
        composable(BottomNavItems.Home.screenRouteName) {
            HomeScreenNavigation()
        }
        composable(BottomNavItems.Profile.screenRouteName) {
            ProfileScreenNavigation()
        }

    }


}