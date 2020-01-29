package pl.c0.sayard.guitartabs

import android.animation.ObjectAnimator
import android.app.Activity
import android.os.AsyncTask
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ProgressBar
import android.widget.TextView
import pl.c0.sayard.guitartabs.dataclasses.TabDataClass
import pl.c0.sayard.guitartabs.networking.UltimateGuitarAPI
import java.lang.String.format


/**
 * Created by Karol on 25.05.2017.
 */
class TabDisplayTask constructor(private val activity: Activity) : AsyncTask<String, Void, TabDataClass>() {

    private val progressBar = activity.findViewById(R.id.tab_display_progress_bar) as ProgressBar
    private val errorMessage = activity.findViewById(R.id.tab_display_error_message) as TextView


    override fun onPreExecute() {
        progressBar.visibility = View.VISIBLE
        errorMessage.visibility = View.GONE
    }

    override fun doInBackground(vararg params: String): TabDataClass? {
        val results = UltimateGuitarAPI().getTab(params[0])
        return results
    }

    override fun onPostExecute(result: TabDataClass?) {
        progressBar.visibility = View.GONE
        if(result != null){
            val tabContent = activity.findViewById(R.id.tab_content) as TextView
            val tabContentTitle = activity.findViewById(R.id.tab_display_title) as TextView
            val tabContentDescription = activity.findViewById(R.id.tab_display_description) as TextView
            val tabContentDifficulty = activity.findViewById(R.id.tab_display_difficulty) as TextView
            val tabContentTuning = activity.findViewById(R.id.tab_display_tuning) as TextView
            val tabContentAuthor = activity.findViewById(R.id.tab_display_author) as TextView

            if(result.version_description == ""){
                tabContentDescription.visibility = View.GONE
            } else {
                tabContentDescription.text = result.version_description
            }
            tabContent.text = result.content
            tabContentTitle.text = format(activity.getString(R.string.tab_title), result.song_name, result.artist_name)
            tabContentDifficulty.text = format(activity.getString(R.string.tab_difficulty), result.difficulty)
            tabContentTuning.text = format(activity.getString(R.string.tab_tuning), result.tuning)
            tabContentAuthor.text = format(activity.getString(R.string.tab_author), result.contributor.username)
        } else{
            errorMessage.visibility = View.VISIBLE
        }
    }
}