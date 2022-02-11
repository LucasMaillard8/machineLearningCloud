package com.cubifan.machinelearningcloud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cubifan.machinelearningcloud.ui.theme.MachineLearningCloudTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MachineLearningCloudTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    homePage()
                }
            }
        }
    }
}

@Preview(name = "Home page")
@Composable
fun homePage() {
    Image(
        painter = painterResource(id = R.drawable.cloudsbackground), null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.2f)) {
            Text(
                text = "What is this cloud ?",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            )
        }
        Box(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(.2f)
                .align(Alignment.BottomStart)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size(150.dp, 70.dp)
            ) {
                Text("See a cloud", fontSize = 16.sp)
            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MachineLearningCloudTheme {
        Image(painter = painterResource(R.drawable.cloudsbackground), null)
        Text("What is this cloud?")
    }
}