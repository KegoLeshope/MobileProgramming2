package za.ac.cput.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MyJourney(){

    Text(
        text = "Full Name: Kegomoditswe Leshope"
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Course: Diploma in ICT: Application Development"
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Department: Faculty of Informatics and Design"
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Student Number: 219189048"
    )
    Spacer(modifier = Modifier.height(20.dp))
}

@Composable
fun DummyButton(navController: NavController){
    Button (onClick = {
        navController.navigate(Screen.ScreenThree.route) }
    ){
        Text (
            text = "Current Module",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}
@Composable
fun BackButton(navController: NavController){
    Button (onClick = {
        navController.navigate(Screen.Welcome.route)
    }){
        Text (
            text = "Back",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}
