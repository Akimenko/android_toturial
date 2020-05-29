package com.example.p0181_dynamiclayout3

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    var lParams1: LinearLayout.LayoutParams? = null
    var lParams2: LinearLayout.LayoutParams? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sbWeight!!.setOnSeekBarChangeListener(this)
        lParams1 = btn1.getLayoutParams() as LinearLayout.LayoutParams?
        lParams2 = btn2.getLayoutParams() as LinearLayout.LayoutParams?

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        val rightValue = seekBar!!.max - progress
        lParams1!!.weight = progress.toFloat()
        lParams2!!.weight = rightValue.toFloat()
        btn1.text = progress.toString()
        btn2.text = rightValue.toString()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        Log.d("", "")
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        Log.d("", "")
    }
}
