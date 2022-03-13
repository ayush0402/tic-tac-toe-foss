package com.ayush.tictactoe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayush.tictactoe.databinding.ActivityMenuBinding
import com.google.android.material.snackbar.Snackbar

class MenuActivity : AppCompatActivity() {
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
        binding.githubRedirect.setOnClickListener {
            // Ref: https://stackoverflow.com/a/3004542/11377112
            val i = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("https://github.com/ayush0402/tic-tac-toe-foss") }
            startActivity(i)
        }
    }
}
