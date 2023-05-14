package com.example.modul4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentfirst  = fragment1()
        val fragment = supportFragmentManager.findFragmentByTag(fragment1::class.java.simpleName)

        if (fragment !is fragment1){
            supportFragmentManager.beginTransaction()
                .add(R.id.container, fragmentfirst, fragment1::class.java.simpleName)
                .commit()
        }
    }
}