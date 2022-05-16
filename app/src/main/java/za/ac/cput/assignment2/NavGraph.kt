package za.ac.cput.assignment2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Welcome.route){
        composable(route=Screen.Welcome.route){
            WelcomeScreen()
            MainContent()
            ButtonNext(navController = navController)
        }
        composable(route = Screen.ScreenTwo.route){
            MyJourney()
            DummyButton(navController = navController)
            BackButton(navController = navController)
        }
        composable(route = Screen.ScreenThree.route){
            MyModules()
            ButtonBack(navController = navController)
            BtnGoodbye(navController = navController)

        }
    }
}
