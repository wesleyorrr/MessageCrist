package com.example.mymensagecrist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mymensagecrist.data.MessageRepository
import com.injesus.ui.MainViewModel

class MainViewModelFactory(private val repository: MessageRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}