package za.ac.cput.mpiiassignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


import za.ac.cput.mpiiassignment2.ui.theme.MPIIAssignment2Theme
import za.ac.cput.mpiiassignment2.ui.theme.Navigate
import za.ac.cput.mpiiassignment2.ui.theme.SetupNavGraph

class WelcomeScreen : ComponentActivity() {


//Declaring the lateinit variable for the navigation controller
private lateinit var  navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MPIIAssignment2Theme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)
                //Calling all methods on runtime

               

            }
        }
    }


}

@Composable
// This is the method that gets used to display a simple text with a background on screen
fun MainContent() {
    Text(
            // Setting the text
            text = "Welcome to my Jetpack Compose Journey!",
            // Using the appropriate color of the text
            style=  TextStyle(Color.White),
            // Creating a background for the text with appropriate sizes and color
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .height(250.dp)
                .background(Color.Black)
                .wrapContentSize(Alignment.Center)
    )
}
@Composable
// This is the method that is used to display a button, icon within a button and alert dialog
fun AlertDialog() {
    // Start of Alert Dialog Code
    val openDialog = remember { mutableStateOf(false) }
    // Column code is used to centrally align all content vertically and horizontally
    Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    )
    // This is the code used to create a button with an icon inside
    {
        Button(onClick = { openDialog.value = true },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        // Type of icon with color chosen
        {
            Icon(imageVector = Icons.Filled.Person,
                    contentDescription = "",
                    tint = Color.White)
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Info", style = TextStyle(Color.White))
        }
    }

    if (openDialog.value) {
        // Setting the title, text, and confirmation button of the alert dialog
        AlertDialog(
                onDismissRequest = { openDialog.value = false },
                // Creating the title that will be displayed when the user clicks the button
                title = {
                    Text(text = "Alert Dialog",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                },
                // Creating the text that will be displayed when the user clicks the button
                text = {
                    Text(text = "Welcome to my journey so far! For now I can say that I am enjoying my time in Electives. " +
                            "I like the idea of learning a new style of coding and I look forward to creating more complex " +
                            "applications in the future for this module.",
                            fontSize = 16.sp)
                },
                /* Creating the close button in the alert dialog that will appear when the user clicks the button and will be
                close the alert dialog */
                confirmButton = {
                    // Creating the text button for the alert dialog
                    TextButton(onClick = {
                        openDialog.value=false
                    }){
                        // Creating appropriate text for closing the alert dialog
                        Text(text = "Close",
                                style = TextStyle(Color.White))
                    }
                },
                /* Setting the background color of the alert dialog and the color of what will be displayed
                in the alert dialog*/
                backgroundColor = Color.Black,
                contentColor = Color.White
        )}



    }

@Composable
//Using the navigation controller Parameter inside the button method
fun StartJourneyButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 200.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Button(
            //Coding to select the screen that the page needs to navigate to
            onClick = {navController.navigate(route=Navigate.Journey.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Start Journey", style = TextStyle(Color.White)
            )
        }
    }
}
@Composable
@Preview(showBackground = true)
fun HomePreview() {
    MainContent()
    AlertDialog()
    StartJourneyButton(navController = rememberNavController())
}














