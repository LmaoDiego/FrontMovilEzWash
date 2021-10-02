package com.example.app_wprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        val tvBanner = findViewById<TextView>(R.id.tvBanner)
        tvBanner.text = "EzWash"
        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        tvInfo.text = "Informacion General"
        val tvCarwash = findViewById<TextView>(R.id.tvCarwash)
        tvCarwash.text = "Royal Carwash"
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        tvDescription.text = "aqui va la descripcion del carwash"
        val tvAddress = findViewById<TextView>(R.id.tvAddress)
        tvAddress.text = "Av. pepito lote 12"
        val tvPhone = findViewById<TextView>(R.id.tvPhone)
        tvPhone.text = "999 999 999"
        val tvTeam = findViewById<TextView>(R.id.tvTeam)
        tvTeam.text = "Equipo"
        val btEdit = findViewById<Button>(R.id.btEdit)
        btEdit.setOnClickListener{
        }
        val btEdit2 = findViewById<Button>(R.id.btEdit2)
        btEdit2.setOnClickListener{
        }
    }
}