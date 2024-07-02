package com.example.practicejetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun CounterView(viewModel: CounterViewModel = viewModel()) {
    val count by viewModel.count.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Count: $count", style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { viewModel.tappedIncrementButton() }) {
                Text(text = "プラス")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = { viewModel.tappedDecrementButton() }) {
                Text(text = "マイナス")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = { viewModel.tappedResetButton() }) {
                Text(text = "リセット")
            }
        }
    }
}