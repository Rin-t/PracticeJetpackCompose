package com.example.practicejetpackcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> get() = _count

    fun tappedIncrementButton() {
        viewModelScope.launch {
            _count.value += 1
        }
    }

    fun tappedDecrementButton() {
        viewModelScope.launch {
            _count.value -= 1
        }
    }

    fun tappedResetButton() {
        viewModelScope.launch {
            _count.value = 0
        }
    }
}