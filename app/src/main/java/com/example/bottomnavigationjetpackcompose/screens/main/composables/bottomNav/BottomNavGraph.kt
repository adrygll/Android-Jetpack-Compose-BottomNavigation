package com.example.bottomnavigationjetpackcompose.screens.main.composables.bottomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationjetpackcompose.screens.home.HomeScreen
import com.example.bottomnavigationjetpackcompose.screens.main.composables.bottomNav.model.BottomBarScreen
import com.example.bottomnavigationjetpackcompose.screens.profile.ProfileScreen
import com.example.bottomnavigationjetpackcompose.screens.settings.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
     NavHost(
         navController = navController, startDestination = BottomBarScreen.Home.route
     ) {
         composable(route = BottomBarScreen.Home.route) {
             HomeScreen()
         }
         composable(route = BottomBarScreen.Profile.route) {
             ProfileScreen()
         }
         composable(route = BottomBarScreen.Settings.route) {
             SettingsScreen()
         }
     }
}