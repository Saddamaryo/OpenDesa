package com.example.opendesa


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Potensi(
    val potensiImage: Int,
    val potensiTitle: String,
    val potensiDesc: String
    )  :Parcelable