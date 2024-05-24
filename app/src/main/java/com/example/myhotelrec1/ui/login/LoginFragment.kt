package com.example.myhotelrec1.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myhotelrec1.R
import com.example.myhotelrec1.ui.logout.LogoutViewModel

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_login, container, false)

        // Initialize the ViewModel
        var loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        // Find the TextView in the layout
        val textView: TextView = root.findViewById(R.id.text_login)

        // Observe the LiveData from the ViewModel and update the TextView
        loginViewModel.text.observe(viewLifecycleOwner) { newText ->
            textView.text = newText
        }

        return root
    }
}