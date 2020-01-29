package pl.c0.sayard.guitartabs.dataclasses

data class TabDataClass(
        val artist_name: String,
        val capo: Int,
        val content: String,
        val contributor: Contributor,
        val date: String,
        val difficulty: String,
        val id: Int,
        val part: String,
        val preset_id: Int,
        val pro_brother: ProBrother,
        val rating: Double,
        val recommended: List<Any>,
        val recording: Recording,
        val song_id: Int,
        val song_name: String,
        val status: String,
        val strumming: List<Any>,
        val tab_access_type: String,
        val tonality_name: String,
        val tp_version: Int,
        val tuning: String,
        val type: String,
        val urlWeb: String,
        val userRating: Double,
        val verified: Int,
        val version: Int,
        val version_description: String,
        val versions: List<Version>,
        val videosCount: Int,
        val votes: Int
) {
    data class Contributor(
        val user_id: Int,
        val username: String
    )

    data class ProBrother(
            val artist_name: String,
            val date: String,
            val id: Int,
            val part: String,
            val preset_id: Int,
            val rating: Double,
            val recording: Recording,
            val song_id: Int,
            val song_name: String,
            val status: String,
            val tab_access_type: String,
            val tonality_name: String,
            val tp_version: Int,
            val type: String,
            val verified: Int,
            val version: Int,
            val version_description: Any,
            val votes: Int
    ) {
        data class Recording(
            val is_acoustic: Int,
            val performance: Any,
            val recording_artists: List<Any>,
            val tonality_name: String
        )
    }

    data class Recording(
        val is_acoustic: Int,
        val performance: Any,
        val recording_artists: List<Any>,
        val tonality_name: String
    )

    data class Version(
            val artist_name: String,
            val date: String,
            val id: Int,
            val part: String,
            val preset_id: Int,
            val rating: Double,
            val recording: Recording,
            val song_id: Int,
            val song_name: String,
            val status: String,
            val tab_access_type: String,
            val tonality_name: String,
            val tp_version: Int,
            val type: String,
            val verified: Int,
            val version: Int,
            val version_description: Any,
            val votes: Int
    ) {
        data class Recording(
            val is_acoustic: Int,
            val performance: Any,
            val recording_artists: List<Any>,
            val tonality_name: String
        )
    }
}