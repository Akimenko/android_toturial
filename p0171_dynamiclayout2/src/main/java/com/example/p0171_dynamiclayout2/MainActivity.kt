package com.example.p0171_dynamiclayout2

import android.R
import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity(), View.OnClickListener {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actiactivity_list_item)

        btnCreate.setOnClickListener(this)
        btnClear.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnCreate -> {
                // Создание LayoutParams c шириной и высотой по содержимому
                val lParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
                    wrapContent, wrapContent
                )
                // переменная для хранения значения выравнивания
                // по умолчанию пусть будет LEFT
                var btnGravity = Gravity.LEFT
                when (rgGravity.checkedRadioButtonId) {
                    R.id.rbLeft -> btnGravity = Gravity.LEFT
                    R.id.rbCenter -> btnGravity = Gravity.CENTER_HORIZONTAL
                    R.id.rbRight -> btnGravity = Gravity.RIGHT
                }
                // переносим полученное значение выравнивания в LayoutParams
                lParams.gravity = btnGravity

                // создаем Button, пишем текст и добавляем в LinearLayout
                val btnNew = Button(this)
                btnNew.text = etName.text.toString()
                llMain.addView(btnNew, lParams)
            }
        }
    }
}
