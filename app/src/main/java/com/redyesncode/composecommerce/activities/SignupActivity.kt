package com.redyesncode.composecommerce.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redyesncode.composecommerce.DashboardActivity
import com.redyesncode.composecommerce.R
import com.redyesncode.composecommerce.activities.ui.theme.ComposecommerceTheme
import com.redyesncode.composecommerce.widgets.commonTextField

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposecommerceTheme {
                setUpSignUpScreen()

            }
        }
    }
}

@Composable
@Preview
fun setUpSignUpScreen(){
    val context = LocalContext.current

    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(252, 29, 92),
            Color(254, 79, 86),

            Color(254, 47, 91)
        )
    )
    setBackgroundForEntireScreen(drawableId = R.drawable.ic_splash_android)

    // Need to add modifier for Making the content  inside it scrollable.

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
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .weight(weight = 1f, fill = false),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column() {
                    Text(
                        text = "SIGN UP", color = Color(252, 29, 92), fontFamily = FontFamily(
                            Font(R.font.roboto_bold, FontWeight.Medium)
                        ), fontSize = 19.sp, modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 0.dp)
                    )
                }
                commonTextField(title = "Enter Name")
                commonTextField(title = "Enter Email")
                commonTextField(title = "Enter Mobile Number")
                Card(modifier = Modifier
                    .padding(0.dp, 45.dp, 0.dp, 0.dp)
                    .size(340.dp, 75.dp) ,backgroundColor = Color.White,elevation = 0.dp, border = BorderStroke(1.dp,Color.LightGray)) {

                    Column(modifier = Modifier.padding(0.dp,2.dp,0.dp,0.dp)) {
                        Text(text = "Enter Password", color = Color.Black, fontFamily = FontFamily(Font(R.font.roboto_medium,
                            FontWeight.Light)), fontSize = 19.sp, modifier = Modifier.padding(12.dp,5.dp,0.dp,0.dp))

                        // For remember the mutable live state.
                        val textState = remember { mutableStateOf(TextFieldValue()) }
                        // Adding for password visibility as well
                        var passwordVisibility = remember { mutableStateOf(false) }
                        TextField(value = textState.value,         visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),onValueChange = {textState.value =it }, textStyle = TextStyle.Default.copy(color = Color.Gray, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.roboto_medium,FontWeight.Normal))),colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray,focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent,backgroundColor = Color.White),modifier = Modifier
                            .background(Color.White, RectangleShape)
                            .fillMaxWidth(), keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done, capitalization = KeyboardCapitalization.None, autoCorrect = false))

                    }



                }
                Card(modifier = Modifier
                    .padding(0.dp, 45.dp, 0.dp, 0.dp)
                    .size(340.dp, 75.dp) ,backgroundColor = Color.White,elevation = 0.dp, border = BorderStroke(1.dp,Color.LightGray)) {

                    Column(modifier = Modifier.padding(0.dp,2.dp,0.dp,0.dp)) {
                        Text(text = "Confirm Password", color = Color.Black, fontFamily = FontFamily(Font(R.font.roboto_medium,
                            FontWeight.Light)), fontSize = 19.sp, modifier = Modifier.padding(12.dp,5.dp,0.dp,0.dp))

                        // For remember the mutable live state.
                        val textState = remember { mutableStateOf(TextFieldValue()) }
                        // Adding for password visibility as well
                        var passwordVisibility = remember { mutableStateOf(false) }
                        TextField(value = textState.value,         visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),onValueChange = {textState.value =it }, textStyle = TextStyle.Default.copy(color = Color.Gray, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.roboto_medium,FontWeight.Normal))),colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray,focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent,backgroundColor = Color.White),modifier = Modifier
                            .background(Color.White, RectangleShape)
                            .fillMaxWidth(), keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done, capitalization = KeyboardCapitalization.None, autoCorrect = false))

                    }



                }
                spacer10H10V()
                spacer10H10V()
                Button(onClick = { // Passing the general activity intent here.

                    // Applied the LocalContext variable here.
                                 context.startActivity(Intent(context,DashboardActivity::class.java))


                }, shape = RoundedCornerShape(50),modifier = Modifier
                    .size(250.dp, 51.dp)
                    .background(horizontalGradientBrush, shape = RoundedCornerShape(40)),colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent) ) {




                    Text(text = "SIGN UP", color = Color.White, fontFamily = FontFamily(
                        Font(R.font.roboto_bold, FontWeight.Medium)
                    ),fontSize = 18.sp)

//                Image(painter = painterResource(id = R.drawable.background_rounded_white), contentDescription = "Main app logo is placed here.")
                    // Image Composable only takes in the Composable with png or jpeg image format.



                }
                spacer10H10V()
                spacer10H10V()
            }
        }
    }





}