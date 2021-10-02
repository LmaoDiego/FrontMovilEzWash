package com.example.app_ezwash.ui.mycars

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCarsViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "Your Cars"
    }
    val text: LiveData<String> = _text
}