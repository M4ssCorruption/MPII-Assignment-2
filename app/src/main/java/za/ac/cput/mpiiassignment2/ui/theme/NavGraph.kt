package za.ac.cput.mpiiassignment2.ui.theme


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import za.ac.cput.mpiiassignment2.MainContent
import za.ac.cput.mpiiassignment2.StartJourneyButton


@Composable
/*Creating the process of navigation to
 allow the user to pass back and fourth
 between pages
 */
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
    startDestination = Navigate.Home.route)
    {
        //Getting all components and functions from the Welcome Screen to be displayed
        composable(Navigate.Home.route)
        {
            MainContent()
            za.ac.cput.mpiiassignment2.AlertDialog()
            //This code is responsible for the navigation because it is calling the navigation variable
          StartJourneyButton(navController = navController)
        }
        //Getting all components and functions from the Welcome Screen to be displayed
        composable(Navigate.Journey.route)
        {
            NameText()
            CourseText()
            DepartmentText()
            StudentNumberText()
            CourseButton()
            //This code is responsible for the navigation because it is calling the navigation variable
            BackButton(navController = navController)
        }

    }
}
