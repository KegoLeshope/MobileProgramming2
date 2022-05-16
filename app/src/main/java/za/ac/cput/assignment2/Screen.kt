package za.ac.cput.assignment2

sealed class Screen (val route: String){
    object Welcome: Screen("welcome_screen")
    object ScreenTwo: Screen("screen_two")
    object ScreenThree: Screen("screen_three")
}
