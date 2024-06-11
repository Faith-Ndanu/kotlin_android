package com.example.myapplication7

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication7.databinding.ActivityFourthBirdBinding
import com.example.myapplication7.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class fourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener {
            finish()
        }

        binding.btnNext4.setOnClickListener {
            val intent = Intent(this, FiftthBirdActivity::class.java)
            startActivity(intent)

        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1558705111-19dbbfedaf24?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDN8fHxlbnwwfHx8fHw%3D")
            .into(binding.imageView5)


    }
}