package com.cinema.guide.features.domain.model

import android.os.Parcelable
import com.cinema.guide.features.domain.utils.EMPTY
import kotlinx.parcelize.Parcelize

@Parcelize
data class Discover(
    val adult: Boolean? = false,
    val backdropPath: String? = EMPTY,
    val genreIds: List<Int>? = arrayListOf(),
    val id: Int? = 0,
    val originalLanguage: String? = EMPTY,
    val originalTitle: String? = EMPTY,
    val overview: String? = EMPTY,
    val popularity: Double? = 0.0,
    val posterPath: String? = EMPTY,
    val releaseDate: String? = EMPTY,
    val title: String? = EMPTY,
    val video: Boolean? = false,
    val voteAverage: Double? = 0.0,
    val voteCount: Int? = 0,
) : Parcelable
