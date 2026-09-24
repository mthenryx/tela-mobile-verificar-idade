package com.example.exercicioconferindoidade

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicioconferindoidade.ui.theme.ExercicioConferindoIdadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicioConferindoIdadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComponentsVerificarIdade(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComponentsVerificarIdade(modifier: Modifier = Modifier) {
    var idade by remember {
        mutableStateOf(0)
    }

    var fraseResposta by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color(0xF9F8FE))
    ) {
        Text(
            text = "Qual é a sua idade?",
            color = Color(0x4559BA),
            fontSize = 50.sp
        )

        Text(
            text = "Aperte os botões para informar a sua idade",
            color = Color.Black,
            fontSize = 50.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "$idade",
            color = Color.Black,
            fontSize = 65.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(

        ) {
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0x4759B5),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Icone de adicionar",
                    modifier = modifier.background(Color.White)
                )
            }

        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "$fraseResposta",
            color = Color(0x4559BA),
            fontSize = 50.sp
        )
    }
}