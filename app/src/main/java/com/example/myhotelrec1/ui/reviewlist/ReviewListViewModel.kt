package com.example.myhotelrec1.ui.reviewlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReviewListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ReviewList Fragment"
    }
    val text: LiveData<String> = _text
}