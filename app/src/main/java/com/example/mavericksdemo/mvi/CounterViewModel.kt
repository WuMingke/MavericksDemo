package com.example.mavericksdemo.mvi

import com.airbnb.mvrx.MavericksViewModel

class CounterViewModel(initState: CounterState) : MavericksViewModel<CounterState>(initState) {
    
    fun incrementCount() {
        setState {
            copy(count = count + 1)
        }
    }
}