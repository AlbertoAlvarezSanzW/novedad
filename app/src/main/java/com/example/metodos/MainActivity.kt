package com.example.metodos


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.metodos.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boton = findViewById<Button>(R.id.boton2)
        val text2 = findViewById<EditText>(R.id.text2)
        boton.setOnClickListener {
            Toast.makeText(this@MainActivity, text2.text.toString(), Toast.LENGTH_LONG).show()
        }


        binding.boton1.setOnClickListener {
            Toast.makeText(this@MainActivity, binding.text.text, Toast.LENGTH_LONG).show()

        }

        boton3.setOnClickListener {
            Toast.makeText(this@MainActivity, text3.text, Toast.LENGTH_LONG).show()
        }
    }
}