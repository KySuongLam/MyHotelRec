package com.example.myhotelrec1.ui.reviewlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myhotelrec1.R
import com.example.myhotelrec1.ui.logout.LogoutViewModel

class ReviewListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_reviewlist, container, false)

        // Initialize the ViewModel
        var reviewListViewModel = ViewModelProvider(this).get(ReviewListViewModel::class.java)

        // Find the TextView in the layout
        val textView: TextView = root.findViewById(R.id.text_reviewlist)

        // Observe the LiveData from the ViewModel and update the TextView
        reviewListViewModel.text.observe(viewLifecycleOwner) { newText ->
            textView.text = newText
        }

        return root
    }


}