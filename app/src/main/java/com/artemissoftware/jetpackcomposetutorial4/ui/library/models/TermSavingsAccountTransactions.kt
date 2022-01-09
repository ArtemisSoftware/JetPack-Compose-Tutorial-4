package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class TermSavingsAccountTransactions(
    @SerializedName("currentPageKey")
    val currentPageKey: String,
    @SerializedName("firstPageKey")
    val firstPageKey: String,
    @SerializedName("lastPageKey")
    val lastPageKey: String,
    @SerializedName("nextPageKey")
    val nextPageKey: String,
    @SerializedName("transactions")
    val transactions: List<TransactionX>
)