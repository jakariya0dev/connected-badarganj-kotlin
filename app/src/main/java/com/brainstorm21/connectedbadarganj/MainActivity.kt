package com.brainstorm21.connectedbadarganj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mfc = R.id.fragment_container

        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.fragment_container, FragmentDashboard())
        fm.commit()

    }
}