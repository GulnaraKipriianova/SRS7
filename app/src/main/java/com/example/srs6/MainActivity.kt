package com.example.srs6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val buttonOne: Button = findViewById(R.id.button_One)
        val buttonTwo: Button = findViewById(R.id.button_Two)
        buttonOne.setOnClickListener {
            val toast = Toast.makeText(this, "У иебя все получится!", Toast.LENGTH_SHORT).show()
        }
        buttonTwo.setOnClickListener {
            val toast = Toast.makeText(this, "Все цели будут достигнуты!", Toast.LENGTH_SHORT).show()
        }

}
}