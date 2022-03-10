package com.ayush.tictactoe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.ayush.tictactoe.databinding.ActivityMenuBinding
import com.google.android.material.snackbar.Snackbar

class menu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnplaywithcomp.setOnClickListener {
            Snackbar.make(binding.root, "Coming Soon", 10_000)
                .apply { setAction("Ok") { dismiss() } }
                .show()
        }
        binding.btnplaywithhuman.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}
