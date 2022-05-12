package org.bubenheimer.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Slider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var value: Float by remember { mutableStateOf(0f) }

            Slider(
                    value,
                    onValueChange = { value = it },
                    onValueChangeFinished = { println("Value change finished: value == $value") }
            )
        }
    }
}
