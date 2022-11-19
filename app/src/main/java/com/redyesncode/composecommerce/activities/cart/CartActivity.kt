package com.redyesncode.composecommerce.activities.cart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redyesncode.composecommerce.R
import com.redyesncode.composecommerce.activities.cart.ui.theme.ComposecommerceTheme
import com.redyesncode.composecommerce.activities.setBackgroundForEntireScreen
import com.redyesncode.composecommerce.activities.spacer10H10V
import com.redyesncode.composecommerce.activities.spacerStart10

class CartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposecommerceTheme {

            }
        }
    }
}

@Composable
@Preview
fun setUpCartScreenUi(){


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {

       spacer10H10V()
       spacer10H10V()
        Row(modifier = Modifier.fillMaxWidth()) {
            spacer10H10V()


            Image(painter = painterResource(id = R.drawable.ic_left_arrow_black), modifier = Modifier
                .size(35.dp)
                .align(Alignment.CenterVertically), contentDescription = "Main Left Arrow" )

            spacerStart10()
            Text(
                text = "Cart",
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.CenterVertically),
                fontSize = 17.sp,
                color = Color.Black,
                fontFamily = FontFamily(
                    Font(
                        R.font.roboto_regular,
                        FontWeight.Normal
                    )
                )
            )


        }

    }





}

