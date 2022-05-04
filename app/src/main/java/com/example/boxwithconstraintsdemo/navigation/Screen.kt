package com.example.boxwithconstraintsdemo.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
}