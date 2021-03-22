package com.n1developer.labmanual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class e_2_1_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_2_1_1)

        findViewById<Button>(R.id.button).setOnClickListener {
            val i = Intent(this, e_2_1_2::class.java)

            i.putExtra("reg", findViewById<EditText>(R.id.editText2)?.text.toString())
            i.putExtra("name", findViewById<EditText>(R.id.editText)?.text.toString())
            i.putExtra("dept", findViewById<Spinner>(R.id.spinner)?.selectedItem.toString())

            startActivity(i)
        }
    }
}