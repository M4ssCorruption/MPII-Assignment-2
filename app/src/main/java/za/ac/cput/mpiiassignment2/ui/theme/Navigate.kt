package za.ac.cput.mpiiassignment2.ui.theme

sealed class Navigate( val route: String){
    //Creating Screen Objects for each screen that we want to navigate to
    object Home: Navigate(route="welcome_screen")
    object Journey: Navigate(route= "journey_screen")
    object Modules: Navigate(route= "module_screen")
}
