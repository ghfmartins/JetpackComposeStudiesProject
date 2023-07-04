/*
    Created by: Gustavo Martins
    Practicing video: Modifiers - Android Jetpack Compose - Part 3 at <https://youtu.be/XCuC_p3E0qo>
 */
package com.ghfmartins.jetpackcomposestudiesproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Column(
              modifier = Modifier
                  .fillMaxHeight(0.5f)
                  .fillMaxWidth()
//                  .requiredWidth(600.dp)
                  .border(50.dp, Color.Green)
                  .padding(50.dp)
                  .border(40.dp, Color.Yellow)
                  .padding(40.dp)
                  .background(Color.Blue),
              verticalArrangement = Arrangement.Center

          ){
              Row(
                  verticalAlignment = Alignment.CenterVertically,
                  horizontalArrangement = Arrangement.SpaceEvenly,
                  modifier = Modifier
                      .fillMaxWidth()
                      .background(Color.White)
              ){
                  Text("Ordem")
                  Spacer(modifier = Modifier.width(20.dp))
                  Text("e")
                  Text("Progresso", modifier = Modifier.clickable {

                  })
              }
          }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}