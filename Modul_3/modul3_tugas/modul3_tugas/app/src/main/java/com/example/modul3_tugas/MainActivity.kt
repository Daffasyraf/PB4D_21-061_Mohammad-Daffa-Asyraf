package com.example.modul3_tugas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol_lanjut = findViewById<Button>(R.id.tombol_penjelasan)

        tombol_lanjut.setOnClickListener(View.OnClickListener {
            val kehalkura1 = Intent(this@MainActivity, penjelasan::class.java)
            startActivity(kehalkura1)
        })
        val gmmIntentUri: Uri = Uri.parse("google.navigation:q=alamat+tujuan")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")

        val tombol_maps = findViewById<Button>(R.id.tombol_maps)

        tombol_maps.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                startActivity(mapIntent);
            }
        }

    }
}