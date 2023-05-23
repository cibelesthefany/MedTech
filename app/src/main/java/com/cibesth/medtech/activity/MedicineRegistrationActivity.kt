package com.cibesth.medtech.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.cibesth.medtech.R
import com.cibesth.medtech.models.MedTech
import com.cibesth.medtech.models.Remedy

class MedicineRegistrationActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medtech_medicine_registration)
        findViewById<Button>(R.id.button_salvar).setOnClickListener{
            registerMedicine()
            openListScreen()

        }
    }

    private fun registerMedicine() {
        val remedy = Remedy(
            name = "Dipirona",
            dosage = "1 vez ao dia",
            hour = "10:00",
            period = "1 mês"
        )
        MedTech.tabletHolder.add(remedy)
    }

    fun openListScreen () {
        var listScreen = Intent(this, ListOfRemediesActivity::class.java)
        startActivity(listScreen)
    }


}