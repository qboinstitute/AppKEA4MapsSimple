package com.qbo.appkea4mapssimple

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qbo.appkea4mapssimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnmaps.setOnClickListener {
            val ubicacionUrl = Uri.parse("geo:0,0?q=-12.069339,-77.034360(Lima)")
            val mapIntent = Intent(Intent.ACTION_VIEW, ubicacionUrl)
            if(mapIntent.resolveActivity(packageManager) != null){
                startActivity(mapIntent)
            }
        }
    }
}