package com.ui.mobilebankingui

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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


@Composable
fun SettlementScreen(navController: NavHostController) {

    var bank by remember {
        mutableStateOf("")
    }

    var rekening by remember {
        mutableStateOf("")
    }

    var jumlah by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(painter = painterResource(id = R.drawable.logomitra), contentDescription = "Login image",
            modifier = Modifier.size(200.dp))

        Text(text = "Settlement", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(20.dp))

//        Text(text = "Login to your account")


        OutlinedTextField(value = bank, onValueChange = {
            bank = it
        }, label = {
            Text(text = "Masukan nama bank")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = rekening, onValueChange = {
            rekening = it
        }, label = {
            Text(text = "Masukan nomor rekening")
        })
//        , visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = jumlah, onValueChange = {
            jumlah = it
        }, label = {
            Text(text = "Masukan jumlah (Rupiah)")
        })
//        , visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            Log.i("Credential", "Bank : $bank Rekening : $rekening")
            navController.navigate("pinS")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF183D57), // Custom hex color
                contentColor = Color.White
            )) {
            Text(text = "Next")
        }

        Spacer(modifier = Modifier.height(32.dp))

//        Text(text = "Forgot Password", modifier = Modifier.clickable {
//
//        })
//
//        Spacer(modifier = Modifier.height(32.dp))
//
//        Text(text = "Or sign in with")
//
//        Row(
//            modifier = Modifier.fillMaxWidth().padding(40.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            Image(painter = painterResource(id = R.drawable.facebook),
//                contentDescription = "Facebook",
//                modifier = Modifier.size(50.dp).clickable {
//                    //Facebook clicked
//                }
//            )
//
//            Image(painter = painterResource(id = R.drawable.google),
//                contentDescription = "Google",
//                modifier = Modifier.size(50.dp).clickable {
//                    //Google clicked
//                }
//            )
//
//            Image(painter = painterResource(id = R.drawable.twitter),
//                contentDescription = "Twitter",
//                modifier = Modifier.size(50.dp).clickable {
//                    //Twitter clicked
//                }
//            )
//        }
    }
}