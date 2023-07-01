package com.example.hectorresume.ui.jobscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hectorresume.R
import com.example.hectorresume.ui.Routes
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp

@Composable
fun JobsScreen(navController: NavHostController) {
    Box(modifier = with(Modifier) {
        fillMaxSize()
            .paint(
                // Replace with your image id
                painterResource(id = R.drawable.motherboard),
                contentScale = ContentScale.Crop,
                alpha = 0.3f
            )

    }) {
        Column(Modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.padding(1.dp))
            Title(title = "Work Experience")

            val job1 = InfoCard(
                "Android Developer",
                "Developer of Android Automotive for Infoentretaiment.",
                "2020-2022",
                listOf("Kotlin", "MVVM", "Jetpack", "Testing", "Jenkings", "Scrum")
            )
            Card(job1)
            val job2 = InfoCard(
                "IoT Engineer",
                "Development and Integration of Smart buildigs with IoT Solutions.",
                "2019-2023",
                listOf("Embeddeds", "Sensors", "Python", "AWS Cloud", "Networks IP")
            )
            Card(job2)
            Spacer(modifier = Modifier.padding(1.dp))
            Title(title = "Professional Education")
            Spacer(modifier = Modifier.padding(1.dp))
            val master = InfoCard(
                "Master IT",
                "Strategic IT Management and development a project focus to Smart Cities.",
                "2023-2024",
                listOf("Project Management", "IoT Solutions", "Data Analytics")
            )
            Card(master)

            val degree = InfoCard(
                "Mechatronic Engineer",
                "Focus to Embeddeds, AI and Data Clustesring",
                "2014-2019",
                listOf("Embeddeds", "Robotics", "Clustering Analytics")
            )
            Card(degree)
            Spacer(modifier = Modifier.padding(1.dp))
            navBasic(navController)
        }
    }

}


@Composable
fun Card(card: InfoCard) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
//        Box(
//            Modifier
//                .weight(0.1f)
//                .fillMaxHeight()
//                .background(Color.Black)
//        )
        Box(
            Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.White)
        ) {

            Column(Modifier.padding(12.dp, 0.dp)) {
                Text(
                    text = card.position,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.padding(1.dp))
                Text(
                    text = card.period,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    card.description,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold, textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    card.skills.toString(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold, textAlign = TextAlign.Start
                )
            }
        }
    }
    Spacer(modifier = Modifier.padding(18.dp, 0.dp))
}

@Composable
fun Title(title: String) {
    Text(
        text = title,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
    )
}

@Composable
fun navBasic(navController: NavHostController) {
    Button(
        onClick = { navController.navigate(Routes.Pantalla1.route) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
    ) {
        Text(text = "Back")
    }
}