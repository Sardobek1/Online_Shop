package com.sardorbek.online_shop.activities.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sardorbek.online_shop.R
import com.sardorbek.online_shop.activities.MainActivity
import com.sardorbek.online_shop.databinding.ActivityPromoBinding

class Promo : AppCompatActivity() {
    lateinit var binding: ActivityPromoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPromoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var code = binding.promo
        var check = 3223
       /* if (code == check){
            binding.start.setOnClickListener {
                startActivity(Intent(this,MainActivity::class.java))
            }
        }*/
    }
}