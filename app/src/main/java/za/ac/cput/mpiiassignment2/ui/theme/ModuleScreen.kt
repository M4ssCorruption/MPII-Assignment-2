package za.ac.cput.mpiiassignment2.ui.theme

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun VerticalScroll(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent)) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(Color.Transparent),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "My Modules", style = TextStyle(Color.White))
    }
    }
    LazyColumn{
        item{ Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(50.dp)

                .padding(10.dp, 0.dp, 305.dp, 8.dp),
            elevation = 5.dp
        )
        {

            Row(verticalAlignment = Alignment.CenterVertically)
            {

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp,0.dp,0.dp,0.dp)
                    .height(70.dp)
                    .width(200.dp),

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
        }}
        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)

                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(180.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))

                    Text(text = "My Modules", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 140.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))

                }
            }}


        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(180.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "ADP3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))

                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(
                        text = "Module Name: Applications Development Practice",
                        style = TextStyle(Color.White)
                    )
                    Text(text = "Module Type: Practical Work", style = TextStyle(Color.White))
                    Text(text = "Module Duration: Year-Round", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }
            }}

        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp)
                ,
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "ADT3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Applications Development Theory", style = TextStyle(Color.White))
                    Text(text= "Module Type: Theory and Practical Work", style = TextStyle(Color.White))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }
                 }}
        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "ICE3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))

                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: ICT Electives 3", style = TextStyle(Color.White))
                    Text(text= "Module Type: Theory and Practical Work", style = TextStyle(Color.White))
                    Text(text= "Module Duration: Semester", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }}}
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                        .padding(10.dp, 0.dp, 10.dp, 5.dp),
                    elevation = 5.dp
                )
                {

                    Row(verticalAlignment = Alignment.CenterVertically)
                    {

                    }
                    Column(
                        modifier = Modifier
                            .padding(16.dp)

                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .height(160.dp)
                            .background(Color.Black)
                            .wrapContentSize(Alignment.Center)
                    ) {
                        Text(text = "==============================================", style = TextStyle(Color.White))
                        Text(text = "ITS3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                        Text(text = "==============================================", style = TextStyle(Color.White))
                        Spacer(modifier = Modifier.padding(vertical = 5.dp))
                        Text(text= "Module Name: Information Systems 3", style = TextStyle(Color.White))
                        Text(text= "Module Type: Theory Work", style = TextStyle(Color.White))
                        Text(text= "Module Duration: Year-Round", style = TextStyle(Color.White))
                        Text(text = "==============================================", style = TextStyle(Color.White))
                    }
                }
            }
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "PFP3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Professional Practice 3", style = TextStyle(Color.White))
                    Text(text= "Module Type: Theory", style = TextStyle(Color.White))
                    Text(text= "Module Duration: Semester", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }
            }
        }

        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "PRT3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Project 3", style = TextStyle(Color.White))
                    Text(text= "Module Type: Practical Work", style = TextStyle(Color.White))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }
            }
        }

        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "PRM3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Project Management 3", style = TextStyle(Color.White))
                    Text(text= "Module Type: Theory Work", style = TextStyle(Color.White))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }
            }
        }

        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp)
                    ,
                elevation = 5.dp
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)

                        .background(Color.Black)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Text(text = "PRP3", style = TextStyle(Color.White), modifier = Modifier.padding(horizontal = 150.dp))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Project Presentation 3", style = TextStyle(Color.White))
                    Text(text= "Module Type: Practical and Theory Work ", style = TextStyle(Color.White))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.White))
                    Text(text = "==============================================", style = TextStyle(Color.White))
                }
            }
        }
        item {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .width(200.dp)
                    .padding(10.dp, 0.dp, 285.dp, 35.dp),
                elevation = 5.dp
            )
            {
                val activity = (LocalContext.current as? Activity)
                val openDialog = remember {
                    mutableStateOf(false)
                }
                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 0.dp),

                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                )
                {
                    Button(

                        onClick = { openDialog.value = true },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                    )
                    {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "",
                            tint = Color.Black
                        )

                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))

                        Text(
                            text = "GoodBye", style = TextStyle(Color.Black)
                        )
                    }
                }
                if (openDialog.value) {
                    AlertDialog(
                        onDismissRequest = { openDialog.value = false },
                        title = {
                            Text(
                                text = "Alert Dialog",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )

                        },
                        dismissButton = {
                            TextButton(onClick = { activity?.finish() }) {
                                Text("Yes", style = TextStyle(Color.White))

                            }

                        },

                            text = { Text(text = "Are you sure you want to leave?", fontSize = 18.sp) },
                            confirmButton = {
                                TextButton(onClick = { openDialog.value = false }) {
                                    Text(text = "Cancel", style = TextStyle(Color.White))

                                }
                        },
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                    )
                }
            }
        }}
}
