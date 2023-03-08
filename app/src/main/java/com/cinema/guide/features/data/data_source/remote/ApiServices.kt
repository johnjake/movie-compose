package com.cinema.guide.features.data.data_source.remote // ktlint-disable package-name

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("movie/550")
    fun movieDetails(
        @Query("api_key") apiKey: String,
    )

    @GET("movie/{movieCode}")
    suspend fun movieDetails(
        @Path("movieCode") movieCode: Int,
        @Query("api_key") apiKey: String,
    )

    /** Movie Discover **/

    @GET("discover/movie")
    suspend fun discoverMovie(
        @Query("api_key") apiKey: String,
        @Query("page") pageNumber: Int,
    )

    @GET("movie/top_rated")
    suspend fun topRated(
        @Query("api_key") apiKey: String,
        @Query("language") languages: String = "en-US",
        @Query("page") pageNumber: Int,
    )

    @GET("movie/now_playing")
    suspend fun nowShowing(
        @Query("api_key") apiKey: String,
        @Query("language") languages: String = "en-US",
        @Query("page") pageNumber: Int,
    )

    @GET("search/movie")
    suspend fun searchMovie(
        @Query("api_key") apiKey: String,
        @Query("query") searchKey: String,
        @Query("page") pageNumber: Int,
    )
}
