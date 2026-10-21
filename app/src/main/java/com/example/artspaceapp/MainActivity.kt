package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceAppTheme {
                ArtSpaceApp()
            }
        }
    }
}
//
//data class ArtWork(
//    @DrawableRes val image: Int,
//    @StringRes val title: String,
//    @StringRes val artist: String,
//    @StringRes val year: String
//)
//
//val artwork = listOf(
//    ArtWork(R.drawable.art1, R.string.art1_title, R.string.art1_artist, R.string.art1_year),
//    ArtWork(R.drawable.art2, R.string.art2_title, R.string.art2_artist, R.string.art2_year),
//    ArtWork(R.drawable.art3, R.string.art3_title, R.string.art3_artist, R.string.art3_year)
//)


@Composable
fun ArtSpaceApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Surface() {
            Image(
                painter = painterResource(R.drawable.art1),
                contentDescription = stringResource(R.string.art1_title)
            )
        }

        Column(
            modifier = Modifier
        ) {
            Text(stringResource(R.string.art1_title))
            Row() {
                Text(stringResource(R.string.art1_artist))
                Text("(${stringResource(R.string.art1_year)})")
            }
        }

        Row() {
            Button(onClick = {}) {
                Text("Previous")
            }
            Button(onClick = {}) {
                Text("Next")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceAppTheme {
        ArtSpaceApp()
    }
}