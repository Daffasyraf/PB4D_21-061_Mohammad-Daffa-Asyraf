package com.example.modul2_pember

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pahlawanList = listOf<item>(
            item(
                R.drawable.a_cozy_cabin_in_a_winter_wonderland__cinematic_landscape,
                 "a cozy cabin in a winter wonderland, cinematic landscape"
            ),
            item(
                R.drawable.boruto_using_jougan,
                 "boruto using jougan"
            ),
            item(
                R.drawable.coffe_in_the_morning_with_city_view,
                 "coffe in the morning with city view"
            ),
            item(
                R.drawable.old_1950s_computer_on_a_pink_background__retro_futurism,
                "old 1950s computer on a pink background, retro futurism"
            ),
            item(
                R.drawable.sport_car_jumping_with_city_view,
                "sport car jumping with city view"
            ),
            item(
                R.drawable.streetphoto_using_golden_rules_without_person_in_it,
                "streetphoto using golden rules without person in it"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recyview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Adapter(this, pahlawanList){
        }

    }
}