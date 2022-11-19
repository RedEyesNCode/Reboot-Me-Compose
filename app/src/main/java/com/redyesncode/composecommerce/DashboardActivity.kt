package com.redyesncode.composecommerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.redyesncode.composecommerce.bottomNavigation.NavigationGraphCustom
import com.redyesncode.composecommerce.ui.theme.ComposecommerceTheme

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposecommerceTheme {
                DashboardActivityView()

            }
        }
    }
}

@Composable
@Preview
fun DashboardActivityView(){

    val navHostController = rememberNavController()
    Scaffold(
        bottomBar = { com.redyesncode.composecommerce.bottomNavigation.BottomNavigation(
            navController = navHostController
        ) }
    ) {
        NavigationGraphCustom(navHostController = navHostController)

    }



}
