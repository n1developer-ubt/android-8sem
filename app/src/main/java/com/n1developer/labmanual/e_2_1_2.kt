package com.n1developer.labmanual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class e_2_1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_2_1_2)

        findViewById<TextView>(R.id.textView1).text = intent.getStringExtra("name")
        findViewById<TextView>(R.id.textView2).text = intent.getStringExtra("reg")
        findViewById<TextView>(R.id.textView3).text = intent.getStringExtra("dept")

    }
}