package com.ui.mobilebankingui

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.platform.LocalContext
import androidx.core.net.toUri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
//import androidx.compose.ui.platform.UriHandlerAmbient
import androidx.compose.ui.platform.LocalContext


@Composable
fun LoginScreen(navController: NavHostController) {
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://i-saku.com/mitra-isaku/")) }


    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

//    val uriHandler = UriHandlerAmbient.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(painter = painterResource(id = R.drawable.logomitra), contentDescription = "Login image",
            modifier = Modifier.size(200.dp))

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Phone")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Email : $email Password : $password")
            navController.navigate("home")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF183D57), // Custom hex color
                contentColor = Color.White
            )) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Do not have account yet?", modifier = Modifier.clickable {

        })

        Button(onClick = {
            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFFFFF), // Custom hex color
                contentColor = Color(0xFF0BA6C3)
            )) {
            Text(text = "Register")
        }

    }
}