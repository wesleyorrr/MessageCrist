package com.example.mymensagecrist.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mymensagecrist.R
import com.example.mymensagecrist.data.MessageRepository
import com.example.mymensagecrist.databinding.ActivityMainBinding
import com.injesus.ui.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory(MessageRepository())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMessage.setOnClickListener {
            viewModel.generateMessage()
        }

        viewModel.message.observe(this) {
            binding.tvMessage.text = it.message
        }
    }
}
