package com.example.app_ezwash.ui.misautos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCarsViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "This is MyCars Fragment"
    }
    val text: LiveData<String> = _text
}