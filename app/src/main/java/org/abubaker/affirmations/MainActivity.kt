package org.abubaker.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}