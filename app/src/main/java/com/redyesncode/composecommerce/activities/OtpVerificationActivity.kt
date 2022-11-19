package com.redyesncode.composecommerce.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.redyesncode.composecommerce.R
import com.redyesncode.composecommerce.activities.ui.theme.ComposecommerceTheme
import com.redyesncode.composecommerce.widgets.CommonOtpTextField

class OtpVerificationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposecommerceTheme {
                setupOtpVerificationScreen()

            }
        }
    }
}


@Composable
@Preview
fun setupOtpVerificationScreen(){
    val context = LocalContext.current
    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(252, 29, 92),
            Color(254, 79, 86),

            Color(254, 47, 91)
        )
    )

    setBackgroundForEntireScreen(drawableId = R.drawable.ic_splash_android)

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 45.dp, 0.dp, 0.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.ic_app_logo),
            modifier = Modifier.size(110.dp, 110.dp),
            contentDescription = "Main app logo is placed here."
        )
        spacer10H10V()

        Text(
            text = "Compose Cookbook",
            fontSize = 25.sp,
            color = Color.White,
            fontFamily = FontFamily(
                Font(
                    R.font.roboto_medium,
                    FontWeight.Medium
                )
            )
        )
        spacer10H10V()
        spacer10H10V()
        Card(
            modifier = Modifier.fillMaxSize(),
            elevation = 8.dp,
            shape = RoundedCornerShape(7, 8, 0, 0)
        ) {

            Column(modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .weight(weight = 1f, fill = false) ,horizontalAlignment = Alignment.CenterHorizontally) {
                Column() {
                    Text(
                        text = "OTP VERIFICATION", color = Color(252, 29, 92), fontFamily = FontFamily(
                            Font(R.font.roboto_bold, FontWeight.Medium)
                        ), fontSize = 19.sp, modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 0.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 75.dp, 0.dp, 0.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    CommonOtpTextField()
                    CommonOtpTextField()
                    CommonOtpTextField()
                    CommonOtpTextField()
                }
                spacer10H10V()
                spacer10H10V()
                spacer10H10V()
                spacer10H10V()
                Button(onClick = { // Passing the general activity intent here.

                    // Change in passing intent and starting new activity in Jetpack compose.
                    val intent = Intent(context,SignupActivity::class.java)
                    context.startActivity(intent)


                }, shape = RoundedCornerShape(50),modifier = Modifier
                    .size(250.dp, 51.dp)
                    .background(horizontalGradientBrush, shape = RoundedCornerShape(40)),colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent) ) {




                    Text(text = "VERIFY OTP", color = Color.White, fontFamily = FontFamily(
                        Font(R.font.roboto_bold, FontWeight.Medium)
                    ),fontSize = 18.sp)
//                Image(painter = painterResource(id = R.drawable.background_rounded_white), contentDescription = "Main app logo is placed here.")
                    // Image Composable only takes in the Composable with png or jpeg image format.



                }
                spacer10H10V()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 5.dp, 0.dp, 0.dp),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Text(text = "0:30", modifier = Modifier,fontSize = 18.sp,color = Color.Gray, fontFamily = FontFamily(Font(R.font.roboto_medium,FontWeight.Medium)))
                    Text(text = "Resend OTP", modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp
                    ),fontSize = 20.sp,color = Color.Gray, fontFamily = FontFamily(Font(R.font.roboto_bold,FontWeight.Medium)))


                }


            }





        }

    }




}


