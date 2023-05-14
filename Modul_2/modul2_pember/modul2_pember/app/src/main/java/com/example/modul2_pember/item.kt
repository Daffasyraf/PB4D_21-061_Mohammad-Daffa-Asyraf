package com.example.modul2_pember

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class item(
    val imgitem: Int,
    val nameitem: String,
) : Parcelable
