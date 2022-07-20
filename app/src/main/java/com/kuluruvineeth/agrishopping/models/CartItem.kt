package com.kuluruvineeth.agrishopping.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CartItem (
    val user_id: String = "",
    val product_id: String = "",
    val title: String = "",
    val price: String = "",
    val image: String = "",
    val cart_quantity: String = "",
    var stock_quantity: String = "",
    var id: String = ""
) : Parcelable