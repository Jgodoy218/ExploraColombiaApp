package me.juliangodoy.exploraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.juliangodoy.exploraapp.ui.theme.ExploraAppTheme
import me.juliangodoy.exploraapp.ui.theme.LoginScreen
import me.juliangodoy.exploraapp.ui.theme.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val myNavController = rememberNavController()

            NavHost(
                navController = myNavController,
                startDestination = "login",
                modifier = Modifier.fillMaxSize()
            ) {
                composable(route = "login"){
                    LoginScreen(onLoginSuccess = {}, onNavigateToRegister = {})
                }

                composable(route = "register") {
                    RegisterScreen(onRegisterSuccess = {}, onNavigateToLogin = {})
                }

            }

        }
    }
}
