package com.sardorbek.online_shop.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.sardorbek.online_shop.activities.adapter.RecyclerAdapter
import com.sardorbek.online_shop.activities.fragment.Promo
import com.sardorbek.online_shop.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        layoutManager = LinearLayoutManager(this)

        recyclerView1.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView1.adapter = adapter
        binding.discount.setOnClickListener {
            startActivity(Intent(this,Promo::class.java))
        }
    }


}