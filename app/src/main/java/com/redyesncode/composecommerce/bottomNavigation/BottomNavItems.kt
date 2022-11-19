package com.redyesncode.composecommerce.bottomNavigation

import com.redyesncode.composecommerce.R

sealed class BottomNavItems(var ItemTitle:String, var itemIcon:Int,var screenRouteName:String){


    object Orders:BottomNavItems("Orders", R.drawable.ic_orders_white,"orders")
    object Home:BottomNavItems("Home", R.drawable.ic_home_white,"home")
    object Profile:BottomNavItems("Profile", R.drawable.ic_profile_illustration,"profile")



}
