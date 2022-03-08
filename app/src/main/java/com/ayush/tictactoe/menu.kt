package com.ayush.tictactoe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnplaywithhuman=findViewById<Button>(R.id.btnplaywithhuman)
        val btnplaywithcomp=findViewById<Button>(R.id.btnplaywithcomp)

        btnplaywithcomp.setOnClickListener {

            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

        }
        btnplaywithhuman.setOnClickListener {
        val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}
