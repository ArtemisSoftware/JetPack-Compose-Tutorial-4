package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class ddd(
    @SerializedName("accountBalancesList")
    val accountBalancesList: List<AccountBalances>,
    @SerializedName("accountCurrency")
    val accountCurrency: String,
    @SerializedName("accountDescription")
    val accountDescription: String,
    @SerializedName("accountNumber")
    val accountNumber: String,
    @SerializedName("accountTransactions")
    val accountTransactions: AccountTransactions,
    @SerializedName("bicswift")
    val bicswift: String,
    @SerializedName("iban")
    val iban: String,
    @SerializedName("termSavingsAccountTransactions")
    val termSavingsAccountTransactions: TermSavingsAccountTransactions
)