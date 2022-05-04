package com.example.boxwithconstraintsdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.boxwithconstraintsdemo.navigation.SetupNavGraph
import com.example.boxwithconstraintsdemo.ui.theme.BoxWithConstraintsDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxWithConstraintsDemoTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }
}
