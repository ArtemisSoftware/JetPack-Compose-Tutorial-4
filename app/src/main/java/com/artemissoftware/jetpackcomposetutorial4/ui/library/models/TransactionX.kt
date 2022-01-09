package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class TransactionX(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("depositSequence")
    val depositSequence: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("earlyWithdrawalDate")
    val earlyWithdrawalDate: String,
    @SerializedName("initialDate")
    val initialDate: String,
    @SerializedName("interestPaymentTermDescription")
    val interestPaymentTermDescription: String,
    @SerializedName("interestRate")
    val interestRate: Int,
    @SerializedName("interestStartDate")
    val interestStartDate: String,
    @SerializedName("maturityDate")
    val maturityDate: String,
    @SerializedName("paymentTypeDescription")
    val paymentTypeDescription: String,
    @SerializedName("productTypeDescription")
    val productTypeDescription: String,
    @SerializedName("subscriptionAmount")
    val subscriptionAmount: Int,
    @SerializedName("termDescription")
    val termDescription: String,
    @SerializedName("transactionType")
    val transactionType: String
)