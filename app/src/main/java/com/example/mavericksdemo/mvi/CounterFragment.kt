package com.example.mavericksdemo.mvi

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import com.example.mavericksdemo.R

class CounterFragment : Fragment(R.layout.fragment_counter), MavericksView {

    private val viewModel: CounterViewModel by fragmentViewModel()
    private var tvCount: TextView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvCount = view.findViewById<TextView>(R.id.tvCount)
        tvCount?.setOnClickListener {
            viewModel.incrementCount()
        }

    }

    @SuppressLint("SetTextI18n")
    override fun invalidate() {
        withState(viewModel) {
            tvCount?.text = "Count:${it.count}"
        }
    }
}