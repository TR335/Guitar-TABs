package pl.c0.sayard.guitartabs.dataclasses

/**
 * Created by Karol on 24.05.2017.
 */
data class TabInfo constructor(
        val id: String,
        val name: String,
        val artist_name: String,
        val type: String
)

data class SongVersionInfo constructor(
        val version: String,
        val type: String,
        val rating: Double,
        val votes: Int
)