package com.injesus.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymensagecrist.data.MessageRepository
import com.example.mymensagecrist.model.BibleMessage

class MainViewModel(private val repository: MessageRepository) : ViewModel() {

    private val _message = MutableLiveData<BibleMessage>()
    val message: LiveData<BibleMessage> = _message

    fun generateMessage() {
        _message.value = repository.getRandomMessage()
    }
}
