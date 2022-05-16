package za.ac.cput.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlin.system.exitProcess

@Composable
fun MyModules(){
    Text ("MY MODULES 2022",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Applications Development Practice3",
        fontStyle= FontStyle.Italic)
    Text("Type: Practical")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Applications Development Theory3",
        fontStyle = FontStyle.Italic)
    Text("Type: Theory")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Information Systems3",
        fontStyle = FontStyle.Italic)
    Text("Type: Theory")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Project3",
        fontStyle = FontStyle.Italic)
    Text("Type: Practical")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text( "Module: Project Presentation 3",
        fontStyle = FontStyle.Italic)
    Text("Type: Practical")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Mobile Programming 2",
        fontStyle = FontStyle.Italic)
    Text("Type: Practical")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Professional Practice3",
        fontStyle = FontStyle.Italic)
    Text("Type: Theory")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

    Text("Module: Project Management3",
        fontStyle = FontStyle.Italic)
    Text("Type: Theory")
    Text("Duration: Yearly")
    Spacer(modifier = Modifier.height(20.dp))

}

@Composable
fun ButtonBack(navController : NavController){
    Button (onClick = {
        navController.navigate(Screen.ScreenTwo.route) }
    ){
        Text (
            text = "Back",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun BtnGoodbye(navController: NavController){
    val visible: MutableState<Boolean> = remember { mutableStateOf(false) }

    ShowDialog1(visible = visible, navController )

    Button (onClick = {}){
        Text (
            text = "Goodbye",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ShowDialog1(visible: MutableState<Boolean>, navController: NavController){
    if(visible.value){
        AlertDialog(
            onDismissRequest = {visible.value = false },
            dismissButton = {
                TextButton(onClick = { visible.value = false;
                    exitProcess(0) }) {
                    Text(text = "Yes")
                }
            },
            confirmButton = {
                TextButton(onClick = { visible.value = false;
                    navController.navigate(Screen.ScreenThree.route) }) {
                    Text(text = "No")
                }
            },
            text = {Text(text = " Leaving Now? ")}
        )
    }
}

