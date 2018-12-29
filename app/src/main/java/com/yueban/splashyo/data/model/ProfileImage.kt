package com.yueban.splashyo.data.model

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class ProfileImage(
    @SerializedName("small") @ColumnInfo(name = "small")
    val small: String = "",
    @SerializedName("large") @ColumnInfo(name = "large")
    val large: String = "",
    @SerializedName("medium") @ColumnInfo(name = "medium")
    val medium: String = ""
)