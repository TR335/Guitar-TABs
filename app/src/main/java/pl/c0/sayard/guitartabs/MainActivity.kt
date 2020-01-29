package pl.c0.sayard.guitartabs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import pl.c0.sayard.guitartabs.networking.TabsCrawlerTask
import pl.c0.sayard.guitartabs.networking.UltimateGuitarAPI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchBar: EditText = findViewById(R.id.search_bar)
        val searchButton: Button = findViewById(R.id.search_button)

        searchButton.setOnClickListener {
            val searchQuery = searchBar.text.replace("\\s".toRegex(), "+")
            val intent = Intent(this, SearchDisplayActivity::class.java)
            intent.putExtra(this.getString(R.string.extra_search_query), searchQuery)
            this.startActivity(intent)
        }
    }
}
