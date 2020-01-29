package pl.c0.sayard.guitartabs

import pl.c0.sayard.guitartabs.dataclasses.SearchDataClass
import pl.c0.sayard.guitartabs.dataclasses.SongVersionInfo
import pl.c0.sayard.guitartabs.dataclasses.TabInfo

/**
 * Created by Karol on 23.05.2017.
 */
class LinkSorter {
    fun sortBySong(search: SearchDataClass): MutableList<TabInfo>{
        val encountered = mutableMapOf<String, Boolean>()
        val sortedList = mutableListOf<TabInfo>()
        search.tabs.forEach {
            if (!encountered.contains(it.song_name) && it.type != "Official" && it.type != "Pro") { //TODO make better tab filter
                encountered[it.song_name] = true
                sortedList.add(
                        TabInfo( //TODO add total versions count
                                it.id.toString(),
                                it.song_name,
                                it.artist_name,
                                it.type
                        )
                )
            }
        }
        return sortedList
    }

    fun filterBySongVersions(song: String, search: SearchDataClass): MutableList<SongVersionInfo> {
        val sortedList = mutableListOf<SongVersionInfo>()
        search.tabs.forEach{
            if (it.song_name == song) {
                sortedList.add(
                        SongVersionInfo(
                                "Version" + it.version, //TODO: ??
                                it.type,
                                it.rating,
                                it.votes
                        )
                )
            }
        }
        return sortedList
    }
}