package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class Scheduling(
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("frequencyType")
    val frequencyType: String,
    @SerializedName("numberOfOperations")
    val numberOfOperations: Int,
    @SerializedName("startDate")
    val startDate: String
)