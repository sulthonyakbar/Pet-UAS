package com.example.helloandroid.Page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.helloandroid.R

@Composable
fun OnBoarding2(navController: NavController) {

    val baseColor = Color(0xFF00676C)
    val ob2 = painterResource(id = R.drawable.ob2)

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Mencari Informasi Hewan \n" +
                    "Peliharaan Jadi Lebih Mudah",
            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 28.dp)
        )

        Image(
            painter = ob2,
            contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .height(350.dp)
                .width(250.dp)
        )

        Row {
            ElevatedButton(
                onClick = {
                    navController.navigate("ob1")
                },
                modifier = Modifier.padding(end = 4.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = baseColor
                ),
            ) {

                Icon(
                    Icons.Default.KeyboardArrowLeft,
                    contentDescription = "Back",
                    tint = Color.White,
                )
            }

            ElevatedButton(
                onClick = {
                    navController.navigate("ob3")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = baseColor
                ),
            ) {

                Icon(
                    Icons.Default.KeyboardArrowRight,
                    contentDescription = "Next",
                    tint = Color.White,
                )
            }
        }
    }
}
