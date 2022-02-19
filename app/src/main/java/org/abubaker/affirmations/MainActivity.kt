package org.abubaker.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import org.abubaker.affirmations.adapter.ItemAdapter
import org.abubaker.affirmations.data.Datasource
import org.abubaker.affirmations.databinding.ActivityMainBinding
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the activity_main.xml file
        // mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // We are going to display total size of the list defined in the Datasource.kt file
        // mBinding.textView.text = Datasource().loadAffirmations().size.toString()

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        // Reference to the RecyclerView in the XML file
        // val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // We are passing the list of data to the ItemAdapter so it can be shown in the RecyclerView
        mBinding.recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mBinding.recyclerView.setHasFixedSize(true)
    }
}

/**
 * To display scrollable list of data we need:
 * 1. item - One data item of the list to display.
 * 2. Adapter - Takes data and prepares it for RecyclerView to display.
 * 3. ViewHolders - A pool of views for RecyclerView to use and reuse to display list of data.
 * 4. RecyclerView - Views on screen
 */