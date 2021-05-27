package com.example.simpleculc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etNum1 = findViewById<EditText>(R.id.etNum1)
        var etNum2 = findViewById<EditText>(R.id.etNum2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSub = findViewById<Button>(R.id.btnsub)
        var btnDiv = findViewById<Button>(R.id.btndiv)
        var btnMult = findViewById<Button>(R.id.btnmult)
        var tvResult = findViewById<TextView>(R.id.tvResult)


        btnAdd.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else {
                var a = etNum1.text.toString().toInt()
                var b = etNum2.text.toString().toInt()
                var Add = a + b
                tvResult.text = "result ${Add}"
            }
        }
        btnSub.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else {
                var a = etNum1.text.toString().toInt()
                var b = etNum2.text.toString().toInt()
                var Sub = a - b
                tvResult.text = "result ${Sub}"
            }
        }
        btnDiv.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else {
                var a = etNum1.text.toString().toInt()
                var b = etNum2.text.toString().toInt()
                var Div = a / b
                tvResult.text = "result ${Div}"
            }
        }
        btnMult.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "enternumber", Toast.LENGTH_LONG).show()
            } else {
                var a= etNum1.text.toString().toInt()
                var b=etNum2.text.toString().toInt()
                var Mult=a*b
                tvResult.text="result${Mult}"
            }

            }

        }
    }