package com.cibesth.medtech.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.cibesth.medtech.R
import com.cibesth.medtech.adapters.ListOfRemediesAdapter

class ListOfRemediesActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medtech_list_of_remedies)
        findViewById<RecyclerView>(R.id.list_of_remedies).adapter = ListOfRemediesAdapter()
        findViewById<Button>(R.id.button_new).setOnClickListener {
            openRegistrationScreen()
        }
    }
    fun openRegistrationScreen () {
        var registrationScreen = Intent(this, MedicineRegistrationActivity::class.java)
        startActivity(registrationScreen)
    }

}