package com.example.app_ezwash

import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_ezwash.Models.CarsUser
import com.example.app_ezwash.Models.CustomAdapter
import com.example.app_ezwash.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var cars: ArrayList<CarsUser> ?= null
    var lista:RecyclerView? = null
    var layoutManager:RecyclerView.LayoutManager?=null
    var adaptador:CustomAdapter?=null


    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_mycars
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        //
        //setupViews()
        //
        //
        cars= ArrayList()
        cars?.add(CarsUser("Toyota Yaris",R.drawable.car1))
        cars?.add(CarsUser("Pagani Sonda",R.drawable.car2))

        lista= findViewById(R.id.lista)
        layoutManager=LinearLayoutManager(this)
        adaptador= CustomAdapter(cars!!)
        lista?.layoutManager=layoutManager
        lista?.adapter=adaptador
        //
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)

        return true

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
    //
    //private fun setupViews() {
    //    TODO("Not yet implemented")
    //}
    //

}