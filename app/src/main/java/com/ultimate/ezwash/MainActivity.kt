package com.ultimate.ezwash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var carWashes = ArrayList<CarWash>()
    var carWashAdapter = CarWashAdapter(carWashes)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadCarWashes()

        initView()
    }

    fun initView() {
        rvCarWash.adapter = carWashAdapter
        rvCarWash.layoutManager = LinearLayoutManager(this)
    }

    private fun loadCarWashes() {
        carWashes.add(CarWash(id = 1 ,description = "Good place Good place Good place Good place ", name = "Royal Car Wash", name_owner = "pepito", qualification = "nice", available = "yes"))
        carWashes.add(CarWash(id = 2 ,description = "Better Good place Better Good place Better Good place", name = "ECOLIM", name_owner = "juanito", qualification = "very nice", available = "no"))
        carWashes.add(CarWash(id = 3 ,description = "More Better Good place More Better Good place", name = "AUTOWASH", name_owner = "felipito", qualification = "God", available = "no"))

    }
}