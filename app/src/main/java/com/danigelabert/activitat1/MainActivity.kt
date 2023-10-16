package com.danigelabert.activitat1

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val okButton: Button = findViewById(R.id.okButton)
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val diceImage: ImageView = findViewById(R.id.animalsImatgeView)
        var contador: Int = 0;

        okButton.setOnClickListener {
            val view: View? = this.currentFocus
            if (view != null) {
                val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0)
            }
            Toast.makeText(this, "Hola "+nameEditText.text, Toast.LENGTH_SHORT).show()
            if (contador%2==0){
                diceImage.setImageResource(R.drawable.tigre)
            } else
                diceImage.setImageResource(R.drawable.leon)
            contador++
        }
    }
}