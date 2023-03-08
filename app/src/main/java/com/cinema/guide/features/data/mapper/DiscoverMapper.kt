package com.cinema.guide.features.data.mapper

import com.cinema.guide.features.domain.model.Discover
import com.cinema.guide.features.presentation.cinema.Discovery

fun Discover.toDiscovery(): Discovery {
    return Discovery(
        adult = this.adult,
        backdropPath = this.backdropPath,
        genreIds = this.genreIds,
        id = this.id,
        originalLanguage = this.originalLanguage,
        originalTitle = this.originalTitle,
        overview = this.overview,
        popularity = this.popularity,
        posterPath = this.posterPath,
        releaseDate = this.releaseDate,
        title = this.title,
        video = this.video,
        voteAverage = this.voteAverage,
        voteCount = this.voteCount,
    )
}
