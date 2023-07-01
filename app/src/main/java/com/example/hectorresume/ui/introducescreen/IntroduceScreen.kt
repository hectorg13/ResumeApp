package com.example.hectorresume.ui.introducescreen

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.TextDelegate.Companion.paint
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hectorresume.R
import com.example.hectorresume.R.drawable.key_background
import com.example.hectorresume.ui.Routes

@Composable
fun IntroduceMyScreen(navController: NavHostController) {
    Box(modifier = with(Modifier) {
        fillMaxSize()
            .paint(
                // Replace with your image id
                painterResource(id = R.drawable.motherboard),
                contentScale = ContentScale.Crop,
                alpha = 0.3f
            )

    })
    {
        Column(
            Modifier
                .padding(12.dp, 0.dp)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            HeaderImage()
            Spacer(modifier = Modifier.padding(8.dp))
            Name()
            Spacer(modifier = Modifier.padding(8.dp))
            Introduce()
            Spacer(modifier = Modifier.padding(8.dp))
            MoreButton(navController)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.raspberry),
        contentDescription = "Header",
        modifier = Modifier.clip(CircleShape)
    )
}

@Composable
fun Name() {
    Text(text = "HECTOR GONZALEZ LOPEZ", fontSize = 24.sp, fontWeight = FontWeight.Bold)
    Text(text = "Software Developer", fontSize = 20.sp, fontWeight = FontWeight.Bold)
}

@Preview
@Composable
fun Introduce() {
    Text(
        text = "A Mechatronic Engineer and technologist with passion, I continue to prepare myself to be part of this digital transformation by developing and directing technological projects.",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center

    )
}

@Composable
fun MoreButton(navController: NavHostController) {
    Button(
        onClick = { navController.navigate(Routes.Pantalla2.route) },
        modifier = Modifier
            .width(310.dp)
            .height(48.dp)
    ) {
        Text("More")
    }
}