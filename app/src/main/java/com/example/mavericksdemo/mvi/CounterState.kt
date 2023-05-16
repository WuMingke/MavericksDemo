package com.example.mavericksdemo.mvi

import com.airbnb.mvrx.MavericksState

data class CounterState(val count: Int = 0) : MavericksState
