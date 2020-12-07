package com.example.metodos


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.metodos.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val boton = findViewById<Button>(R.id.boton2)
        val text2 = findViewById<EditText>(R.id.text2)
        boton.setOnClickListener {
            Toast.makeText(this@MainActivity2, text2.text.toString(), Toast.LENGTH_LONG).show()
        }

    }
}

