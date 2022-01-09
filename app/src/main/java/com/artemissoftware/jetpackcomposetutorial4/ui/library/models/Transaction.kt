package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class Transaction(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("availableBalanceAfterTransaction")
    val availableBalanceAfterTransaction: Int,
    @SerializedName("bookBalanceAfterTransaction")
    val bookBalanceAfterTransaction: Int,
    @SerializedName("bookDate")
    val bookDate: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("transactionId")
    val transactionId: String,
    @SerializedName("transactionType")
    val transactionType: String,
    @SerializedName("valueDate")
    val valueDate: String
)