package com.jeisonortiz.mymovidb.data.server


import com.google.gson.annotations.SerializedName

data class ListMovies(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movies: List<Movies>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)