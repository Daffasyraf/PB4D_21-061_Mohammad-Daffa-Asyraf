package com.example.tampiltext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtText : EditText
    private lateinit var btnsubmit : Button
    private lateinit var tvtampil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtText = findViewById(R.id.et_input)
        btnsubmit = findViewById(R.id.button_submit)
        tvtampil = findViewById(R.id.tv_tampil)

        btnsubmit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id == R.id.button_submit){
            val isiEditText = edtText.text.toString()

            tvtampil.text = isiEditText
        }
    }

}