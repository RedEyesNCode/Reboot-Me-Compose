package com.redyesncode.composecommerce.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redyesncode.composecommerce.R


@Composable
fun CommonOtpTextField() {
 OutlinedTextField(
  value = "9",
  singleLine = true,
  onValueChange = { /*TODO*/},
  keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
  shape = RoundedCornerShape(6.dp),
  modifier = Modifier
   .width(60.dp)
   .height(60.dp).border(1.dp, Color.Gray, RoundedCornerShape(6.dp)),
  maxLines = 1,

  textStyle  = TextStyle.Default.copy(color = Color.Black, textAlign = TextAlign.Center,fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.roboto_bold,FontWeight.Bold)))
  )

}

@Composable
fun commonTextField(title:String){

 Card(
  modifier = Modifier
   .padding(0.dp, 45.dp, 0.dp, 0.dp)
   .size(340.dp, 95.dp),
  backgroundColor = Color.White,
  elevation = 0.dp,
  border = BorderStroke(
   1.dp,
   Color.LightGray
  )
 ) {
  Column(modifier = Modifier.padding(0.dp, 2.dp, 0.dp, 0.dp)) {
   Text(
    text = title,
    color = Color.Black,
    fontFamily = FontFamily(
     Font(
      R.font.roboto_medium,
      FontWeight.Light
     )
    ),
    fontSize = 19.sp,
    modifier = Modifier.padding(12.dp, 5.dp, 0.dp, 0.dp)
   )

   // For remember the mutable live state.
   val textState = remember { mutableStateOf(TextFieldValue()) }
   TextField(
    value = textState.value,
    onValueChange = { textState.value = it },
    textStyle = TextStyle.Default.copy(
     color = Color.Gray, fontSize = 18.sp, fontFamily = FontFamily(
      Font(R.font.roboto_medium, FontWeight.Normal)
     )
    ),
    colors = TextFieldDefaults.textFieldColors(
     textColor = Color.Gray,
     focusedIndicatorColor = Color.Transparent,
     unfocusedIndicatorColor = Color.Transparent,
     backgroundColor = Color.White
    ),
    modifier = Modifier
     .background(Color.White, RectangleShape)
     .fillMaxWidth(),
    keyboardOptions = KeyboardOptions(
     keyboardType = KeyboardType.Text,
     imeAction = ImeAction.Next,
     capitalization = KeyboardCapitalization.None,
     autoCorrect = false
    )
   )

  }






 }

}