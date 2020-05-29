package com.example.p0191_simplecalculator

import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var oper  = ""
    val MENU_RESET_ID = 1
    val MENU_QUIT_ID = 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDiv.setOnClickListener(this)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, MENU_RESET_ID, 0, "Reset")
        menu.add(0, MENU_QUIT_ID, 0, "Quit")
        return super.onCreateOptionsMenu(menu)
    }

    // обработка нажатий на пункты меню
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            MENU_RESET_ID -> {
                // очищаем поля
                etNum1.setText("")
                etNum2.setText("")
                tvResult.text = ""
            }
            MENU_QUIT_ID ->             // выход из приложения
                finish()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {

        var num1: Float = 0F
        var num2: Float = 0F
        var result: Float = 0F

        if(TextUtils.isEmpty(etNum1.text.toString())||TextUtils.isEmpty(etNum2.text.toString())){
            return
        }

        num1 = etNum1.text.toString().toFloat()
        num2 = etNum2.text.toString().toFloat()


        when (v!!.id){

            R.id.btnAdd -> {
                oper = "+"
                result = num1 + num2
            }

            R.id.btnSub -> {
                oper = "-"
                result = num1 - num2
            }

            R.id.btnMult -> {
                oper = "*"
                result = num1 * num2
            }

            R.id.btnDiv -> {
                oper = "/"
                result = num1 / num2
            }

        }

        tvResult.setText(num1.toString() + " " + oper + " " + num2 + " = "+ result.toString())
    }
}
