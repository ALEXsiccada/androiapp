package com.example.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test1.ui.theme.Test1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Sad(
                        stringResource(R.string.plan1),
                        stringResource(R.string.plan2),
                        stringResource(R.string.plan3),
                    )
                }
            }
        }
    }
}

@Composable
fun Sad(plan1 : String, plan2 : String, plan3 : String, modifier: Modifier = Modifier) {
Column(verticalArrangement = Arrangement.Center){
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = "face"
    )

    Text(
        text = plan1,
        fontSize = 24.sp,
        modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
    )
    Text(
        text = plan2,
        modifier = modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text = plan3,
        modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
        textAlign = TextAlign.Justify
    )
}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Test1Theme {
        Sad(
            stringResource(R.string.plan1),
            stringResource(R.string.plan2),
            stringResource(R.string.plan3),
        )
    }
}