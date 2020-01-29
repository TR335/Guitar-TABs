package pl.c0.sayard.guitartabs.networking

import android.app.Activity
import android.content.Context
import pl.c0.sayard.guitartabs.dataclasses.SearchDataClass


/**
 * Created by Karol on 23.05.2017.
 */
class TabsCrawlerTask constructor(val activity: Activity, val context: Context): android.os.AsyncTask<String, Void, SearchDataClass>() {

    private val progressBar = activity.findViewById(pl.c0.sayard.guitartabs.R.id.progress_bar) as android.widget.ProgressBar
    private val errorMessage = activity.findViewById(pl.c0.sayard.guitartabs.R.id.error_message) as android.widget.TextView

    override fun onPreExecute() {
        progressBar.visibility = android.view.View.VISIBLE
        errorMessage.visibility = android.view.View.GONE
    }

    override fun doInBackground(vararg params: String): SearchDataClass? {
//        try {
            val results = UltimateGuitarAPI().search(params[0], 1)
            return results
//        } catch(e: Exception){
//            val results = null
//            return results
//        }
    }

    override fun onPostExecute(results: SearchDataClass?) {
        progressBar.visibility = android.view.View.GONE
        if(results == null){
            errorMessage.visibility = android.view.View.VISIBLE
        } else{
            val recyclerView: android.support.v7.widget.RecyclerView = activity.findViewById(pl.c0.sayard.guitartabs.R.id.search_list) as android.support.v7.widget.RecyclerView
            val layoutManager: android.support.v7.widget.RecyclerView.LayoutManager = android.support.v7.widget.LinearLayoutManager(activity)
            recyclerView.layoutManager = layoutManager
            val adapter: pl.c0.sayard.guitartabs.SearchAdapter = pl.c0.sayard.guitartabs.SearchAdapter(context, results)
            recyclerView.adapter = adapter
        }
    }
}