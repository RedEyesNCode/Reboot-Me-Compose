package com.redyesncode.composecommerce

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redyesncode.composecommerce.activities.LoginActivity
import com.redyesncode.composecommerce.ui.theme.ComposecommerceTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This set content view method is similar to  setContentView Method in kotlin
        // Remember we will call other compose function inside this set content view method.

        // XML and Composable functions can co-exist together. (Just like kotlin & java files can co-exist together).
        
        setContent {
            ComposecommerceTheme {
                // A surface container using the 'background' color from the theme
                //REMEMBER THAT COMPOSABLE FUNCTIONS CAN ONLY BE CALLED FROM INSIDE OTHER
                // COMPOSABLE FUNCTIONS IN ANDROID.

                // I will be making a kotlin class for each screen just like we create a xml and kotlin
                // file while developing with XML.
                setUpSplashScreenInterface()
            }
        }


        // Buiness logic



    }
    // Declaring the first composable function here for making splash screen.
    @Composable
    @Preview
    fun setUpSplashScreenInterface(){
        setBackgroundForEntireScreen(drawableId = R.drawable.ic_splash_android)
        // For setting up the elements in the center of the screen fillMaxSize + Vertical arrangement to be center , alignment centerHorizontally.

        Column(modifier = androidx.compose.ui.Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.ic_app_logo), modifier = Modifier.size(110.dp,110.dp), contentDescription = "Main app logo is placed here.")

            spacer10H10V()

            Text(text = "Compose Cookbook", fontSize = 25.sp,color = Color.White, fontFamily = FontFamily(Font(R.font.roboto_medium,FontWeight.Medium)))
            spacer10H10V()
            spacer10H10V()
            spacer10H10V()
            spacer10H10V()

            Button(onClick = { // Passing the general activity intent here.

                             val intent = Intent(this@SplashActivity,LoginActivity::class.java)
                startActivity(intent)

                 }, shape = RoundedCornerShape(50),modifier = Modifier.size(250.dp,51.dp),colors = ButtonDefaults.buttonColors(backgroundColor = Color.White) ) {
                Text(text = "GET STARTED", color = Color(252,29,92), fontFamily = FontFamily(
                    Font(R.font.roboto_bold, FontWeight.Medium)
                ),fontSize = 18.sp)
//                Image(painter = painterResource(id = R.drawable.background_rounded_white), contentDescription = "Main app logo is placed here.")
                // Image Composable only takes in the Composable with png or jpeg image format.



            }
            Text(text = "SIGN IN", modifier = Modifier.padding(0.dp,25.dp),fontSize = 21.sp,color = Color.White, fontFamily = FontFamily(Font(R.font.roboto_medium,FontWeight.Medium)))


        }
    }

    @Composable
    fun spacer10H10V(){
        Spacer(modifier = Modifier.padding(10.dp,10.dp))
    }
    
    
    @Composable
    fun setBackgroundForEntireScreen(drawableId: Int){

        Image(painter = painterResource(id = drawableId),modifier = Modifier.fillMaxSize(1f), contentScale = ContentScale.FillBounds, contentDescription ="Login background." )
//        Box(modifier = Modifier.fillMaxSize()) {
//            Image(
//                painter = painterResource(R.drawable.splash_background),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxSize(),
//                contentScale = ContentScale.Fit // Your contentscale
//            )
//        }


    }




}



