package com.example.p0121_logandmess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val LogTag = "myLogs";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LogTag, "засетим листеенеры")
        btnOk.setOnClickListener{tvOut.setText("OK")}
        btnCancel.setOnClickListener{tvOut.setText("Cancel"); Log.d(LogTag,"нажата кансле"); Toast.makeText(this,"Нажата кансель", Toast.LENGTH_LONG).show()}

    }
}
