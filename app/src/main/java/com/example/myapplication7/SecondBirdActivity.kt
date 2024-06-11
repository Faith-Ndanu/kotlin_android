package com.example.myapplication7

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication7.databinding.ActivityMainBinding
import com.example.myapplication7.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener{
            finish()
        }

        binding.btnNext2.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
        .load("https://media.istockphoto.com/id/1461425620/photo/american-white-ibis.webp?b=1&s=170667a&w=0&k=20&c=cmGdrj888MpSLDhfX75T5MjvfrEefmfE25BSQeu2I-E=")
        .into(binding.imageView2)
        }
        }

