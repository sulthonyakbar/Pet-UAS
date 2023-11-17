package com.example.helloandroid.Page

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.helloandroid.R

@Composable
fun OnBoarding1(navController: NavController) {

    val baseColor = Color(0xFF00676C)
    val ob1 = painterResource(id = R.drawable.ob1)

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Konsultasi Mudah dan Cepat \n" +
                    "dengan Dokter Hewan",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 28.dp)
        )

        Image(
            painter = ob1,
            contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .height(350.dp)
                .width(250.dp)
        )

        ElevatedButton(onClick = {
            navController.navigate("ob2")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = baseColor),
            ) {

            Icon(
                Icons.Default.KeyboardArrowRight,
                contentDescription = "Next",
                tint = Color.White,
                )
        }
    }

    }
