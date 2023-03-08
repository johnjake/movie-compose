package com.cinema.guide.features.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RootDiscover(
    val page: Int? = 0,
    val results: List<Discover>? = arrayListOf(),
    val totalPages: Int? = 0,
    val totalResults: Int? = 0
) : Parcelable