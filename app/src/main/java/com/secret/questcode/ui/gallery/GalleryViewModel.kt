package com.secret.questcode.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "May be it's a key?"
    }
    val text: LiveData<String> = _text

    //TODO: sometimes we try to find something...
}