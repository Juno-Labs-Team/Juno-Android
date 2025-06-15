package com.junolabs.juno.ui.rides

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RidesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "My Rides - Coming Soon"
    }
    val text: LiveData<String> = _text
}