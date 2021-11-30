package com.example.davaleban4.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.davaleban4.R
import java.time.temporal.TemporalAmount

class FragmentOne :Fragment(R.layout.fragment_one) {

    private lateinit var editTextAmount : EditText
    private lateinit var buttonSend : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById(this.editTextAmount)
        buttonSend = view.findViewById(buttonSend)!!
    }

}

private fun View.findViewById(buttonSend: Button): Button? {
    TODO("Not yet implemented")
}

private fun View.findViewById(editTextAmount: EditText) {

}
