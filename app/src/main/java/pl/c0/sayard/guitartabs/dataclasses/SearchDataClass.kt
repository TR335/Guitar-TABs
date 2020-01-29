package pl.c0.sayard.guitartabs.dataclasses

data class SearchDataClass(
    val artists: List<String>,
    val tabs: List<Tab>
) {
    data class Tab(
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
            val version_description: String,
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