package com.msayeh.codelab_basiclayoutsincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.msayeh.codelab_basiclayoutsincompose.components.HomeScreen
import com.msayeh.codelab_basiclayoutsincompose.components.SootheBottomNavigation
import com.msayeh.codelab_basiclayoutsincompose.ui.theme.CodelabBasicLayoutsInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodelabBasicLayoutsInComposeTheme {
                MySootheApp()
            }
        }
    }
}

// Step: MySoothe App - Scaffold
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySootheApp() {
    Scaffold(
        bottomBar = { SootheBottomNavigation() }
    ) { padding ->
        HomeScreen(modifier = Modifier.padding(padding))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}