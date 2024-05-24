package com.example.myhotelrec1.ui.logout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myhotelrec1.R

class LogoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_logout, container, false)

        // Initialize the ViewModel
        var logoutViewModel = ViewModelProvider(this).get(LogoutViewModel::class.java)

        // Find the TextView in the layout
        val textView: TextView = root.findViewById(R.id.text_logout)

        // Observe the LiveData from the ViewModel and update the TextView
        logoutViewModel.text.observe(viewLifecycleOwner) { newText ->
            textView.text = newText
        }

        return root
    }
}