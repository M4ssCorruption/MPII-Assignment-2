package za.ac.cput.mpiiassignment2.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import androidx.navigation.compose.rememberNavController


class JourneyScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

               //Calling all methods on runtime
                NameText()
                CourseText()
                DepartmentText()
                StudentNumberText()
                CourseButton()
                BackButton(navController = rememberNavController())

            }

    }
}
@Composable
fun NameText() {

    Text(
        // Setting the text
        text = "Name: Daniel Marais",

        // Using the appropriate color of the text
        style = TextStyle(Color.White),
        // Creating a background for the text with appropriate sizes and color
        modifier = Modifier
            .padding(16.dp)
            .padding(vertical = 50.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color.Black)
            .wrapContentSize(Alignment.Center)


    )


}
@Composable
fun CourseText() {
    Text(
        // Setting the text
        text = "Course: Applications Development",

        // Using the appropriate color of the text
        style = TextStyle(Color.White),
        // Creating a background for the text with appropriate sizes and color
        modifier = Modifier

            .padding(vertical = 170.dp)
            .padding(horizontal = 15.dp)
            .width(380.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color.Black)
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun DepartmentText() {
    Text(
        // Setting the text
        text = "Department: Information and Communications Technology",

        // Using the appropriate color of the text
        style = TextStyle(Color.White),
        // Creating a background for the text with appropriate sizes and color
        modifier = Modifier

            .padding(vertical = 274.dp)
            .padding(horizontal = 14.dp)
            .width(381.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color.Black)
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun StudentNumberText() {
    Text(
        // Setting the text
        text = "Student Number: 219476845",

        // Using the appropriate color of the text
        style = TextStyle(Color.White),
        // Creating a background for the text with appropriate sizes and color
        modifier = Modifier

            .padding(horizontal = 14.dp)
            .padding(vertical = 100.dp)
            .padding(top = 278.dp)
            .width(381.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color.Black)
            .wrapContentSize(Alignment.Center),

        




    )
}
@Composable
fun CourseButton(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp),


        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        {
            Icon(
                imageVector = Icons.Filled.Edit,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Course Modules", style = TextStyle(Color.White))
        }
    }
}
@Composable
//Using the navigation controller as parameter in the BackButton method parenthesis
fun BackButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 0.dp),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
    {
        Button(
            //Using popBackstack to go back to the Welcome Screen that called the JourneyScreen
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Back", style = TextStyle(Color.White)
            )
        }
    }
}

@Composable
@Preview (showBackground = true)
fun JourneyScreenPreview() {
    NameText()
    CourseText()
    DepartmentText()
    StudentNumberText()
    CourseButton()
    BackButton(navController = rememberNavController())
}
