package com.example.myapplication7

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication7.databinding.ActivitySecondBirdBinding
import com.example.myapplication7.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener{
            finish()
        }

        binding.btnNext3.setOnClickListener {
            val intent = Intent(this,fourthBirdActivity::class.java)
            startActivity(intent)

        }
        Picasso.get()
            .load("https://media.istockphoto.com/id/185262775/photo/rufous-hummingbird-male-white-background.webp?b=1&s=170667a&w=0&k=20&c=PUEg6K-lZPdzlnoIL0-QZdmHzUPW_h1H1QsFS_Us1us=")
            .resize(1500,1000)
            .into(binding.imageView4)
    }
}