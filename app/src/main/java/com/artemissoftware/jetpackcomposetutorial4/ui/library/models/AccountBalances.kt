package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class AccountBalances(
    @SerializedName("availableBalance")
    val availableBalance: Int,
    @SerializedName("availableBalanceForInvestmentsTrading")
    val availableBalanceForInvestmentsTrading: Int,
    @SerializedName("availableOverdraft")
    val availableOverdraft: Int,
    @SerializedName("bookBalance")
    val bookBalance: Int,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("negotiatedOverdraftLimit")
    val negotiatedOverdraftLimit: Int,
    @SerializedName("pendingFunds")
    val pendingFunds: Int,
    @SerializedName("unavailableBalance")
    val unavailableBalance: Int,
    @SerializedName("uncollectedFunds")
    val uncollectedFunds: Int,
    @SerializedName("usedOverdraft")
    val usedOverdraft: Int
)