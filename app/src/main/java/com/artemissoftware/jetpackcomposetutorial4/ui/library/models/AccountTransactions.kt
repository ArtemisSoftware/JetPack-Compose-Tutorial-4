package com.artemissoftware.jetpackcomposetutorial4.ui.library.models


import com.google.gson.annotations.SerializedName

data class AccountTransactions(
    @SerializedName("currentPageKey")
    val currentPageKey: String,
    @SerializedName("customerMessage")
    val customerMessage: String,
    @SerializedName("firstPageKey")
    val firstPageKey: String,
    @SerializedName("lastPageKey")
    val lastPageKey: String,
    @SerializedName("nextPageKey")
    val nextPageKey: String,
    @SerializedName("operationId")
    val operationId: Int,
    @SerializedName("operationStatus")
    val operationStatus: String,
    @SerializedName("scheduling")
    val scheduling: Scheduling,
    @SerializedName("sentForIvr")
    val sentForIvr: Boolean,
    @SerializedName("totalCount")
    val totalCount: Int,
    @SerializedName("transactions")
    val transactions: List<Transaction>,
    @SerializedName("validForCertification")
    val validForCertification: Boolean
)