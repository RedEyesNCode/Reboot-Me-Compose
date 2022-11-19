package com.redyesncode.composecommerce.bottomNavigation

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redyesncode.composecommerce.R
import com.redyesncode.composecommerce.activities.LoginActivity
import com.redyesncode.composecommerce.activities.setBackgroundForEntireScreen
import com.redyesncode.composecommerce.activities.spacer10H10V
import com.redyesncode.composecommerce.activities.spacerStart10


@Composable
@Preview
fun HomeScreenNavigation(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        spacer10H10V()
        spacer10H10V()


        Row(modifier = Modifier.fillMaxWidth()) {
            var searchValue  by remember {
                mutableStateOf("Search")
            }
            spacerStart10()
            TextField(value = searchValue, onValueChange = {searchValue = it}, singleLine = true, shape = RoundedCornerShape(10), modifier = Modifier
                .background(
                    Color.LightGray,
                    CircleShape
                )
                .wrapContentSize(),colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Gray,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.LightGray,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),textStyle = TextStyle(color = Color.Gray, textAlign = TextAlign.Start,fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.roboto_medium,FontWeight.Medium))))





        }
        Row(modifier = Modifier.fillMaxWidth()) {
            spacerStart10()
            Text(
                text = "Trending Products",
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.CenterVertically),
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily(
                    Font(
                        R.font.roboto_bold,
                        FontWeight.Bold
                    )
                )
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .padding(0.dp, 0.dp, 8.dp, 0.dp)) {
                Button(onClick = { // Passing the general activity intent here.

                }, shape = RoundedCornerShape(50),modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.End),colors = ButtonDefaults.buttonColors(backgroundColor = Color.White) ) {
                    Text(text = "View all", color = Color(252,29,92), fontFamily = FontFamily(
                        Font(R.font.roboto_bold, FontWeight.Medium)
                    ),fontSize = 8.sp)
//                Image(painter = painterResource(id = R.drawable.background_rounded_white), contentDescription = "Main app logo is placed here.")
                    // Image Composable only takes in the Composable with png or jpeg image format.



                }

            }


        }


    }



        
    }

@Composable
fun OrdersNavigationScreen(){
    setBackgroundForEntireScreen(drawableId = R.drawable.ic_splash_android)

    Row(modifier = Modifier.fillMaxWidth()) {
        spacer10H10V()


        Image(painter = painterResource(id = R.drawable.ic_left_arrow), modifier = Modifier
            .size(35.dp)
            .align(Alignment.CenterVertically), contentDescription = "Main Left Arrow" )

        spacerStart10()
        Text(
            text = "My Account",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.CenterVertically),
            fontSize = 17.sp,
            color = Color.White,
            fontFamily = FontFamily(
                Font(
                    R.font.roboto_regular,
                    FontWeight.Normal
                )
            )
        )
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterVertically)
            .padding(0.dp, 0.dp, 8.dp, 0.dp)) {
            Button(onClick = { // Passing the general activity intent here.

            }, shape = RoundedCornerShape(50),modifier = Modifier
                .wrapContentSize()
                .align(Alignment.End),colors = ButtonDefaults.buttonColors(backgroundColor = Color.White) ) {
                Text(text = "Edit Profile", color = Color(252,29,92), fontFamily = FontFamily(
                    Font(R.font.roboto_bold, FontWeight.Medium)
                ),fontSize = 8.sp)
//                Image(painter = painterResource(id = R.drawable.background_rounded_white), contentDescription = "Main app logo is placed here.")
                // Image Composable only takes in the Composable with png or jpeg image format.



            }
            
        }


    }
    
    spacer10H10V()
    spacer10H10V()

    spacer10H10V()
    spacer10H10V()


    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 45.dp, 0.dp, 0.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile_illustration),
            modifier = Modifier
                .size(110.dp, 110.dp)
                .clip(CircleShape)
                .border(3.dp, Color.White, CircleShape),
            contentScale = ContentScale.Crop,
            contentDescription = "Main app logo is placed here."
        )

        spacer10H10V()
        Text(
            text = "All this For 4 Hearts",
            fontSize = 19.sp,
            color = Color.White,
            fontFamily = FontFamily(
                Font(
                    R.font.roboto_bold,
                    FontWeight.Bold
                )
            )
        )
        Text(
            text = "redeyesncode@compose",
            fontSize = 15.sp,
            color = Color.White,
            fontFamily = FontFamily(
                Font(
                    R.font.roboto_regular,
                    FontWeight.Normal
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
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .weight(weight = 1f, fill = false),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ModuleLayout(moduleName = "Upcoming orders",R.drawable.ic_truck)
                spacer10H10V()
                ModuleLayout(moduleName = "Manage address",R.drawable.ic_location)
                spacer10H10V()
                ModuleLayout(moduleName = "Update payment",R.drawable.ic_cards)
                spacer10H10V()
                ModuleLayout(moduleName = "Customer Support",R.drawable.ic_chats)
            }
        }
    }
}

@Composable
@Preview
fun ProductItemComposable(){
    Card(modifier = Modifier.fillMaxSize(),border = BorderStroke(2.dp,Color.Gray), shape = RoundedCornerShape(8),backgroundColor = Color.White,elevation = 0.dp) {

        Column(modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.drawable.ic_profile_illustration), alignment = Alignment.Center, contentDescription ="Product Image", modifier = Modifier.size(200.dp).clip(
                RoundedCornerShape(25)
            ).border(5.dp,Color.White))
            Text(
                text = "Trending Products",
                modifier = Modifier
                    .wrapContentSize(),
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily(
                    Font(
                        R.font.roboto_bold,
                        FontWeight.Bold
                    )
                )
            )

        }

    }





}

@Composable
fun ModuleLayout(moduleName:String, drawableResource:Int){

    Column {
        spacer10H10V()
        spacer10H10V()
        spacer10H10V()
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = drawableResource),
                modifier = Modifier
                    .size(35.dp, 35.dp),
                contentScale = ContentScale.Fit,
                contentDescription = "Main app logo is placed here."
            )
            spacerStart10()
            spacerStart10()
            Text(text = moduleName, color =Color.Gray, fontFamily = FontFamily(
                Font(R.font.roboto_bold, FontWeight.Normal)
            ),fontSize = 19.sp, modifier = Modifier.fillMaxHeight())

        }





    }






}


@Composable
fun ProfileScreenNavigation(){

    Text(text = "Profile Screen", fontSize = 25.sp,color = Color.White, fontFamily = FontFamily(
        Font(
            R.font.roboto_medium,
            FontWeight.Medium)
    )
    )
}