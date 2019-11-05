package com.example.week3_somruethai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setTitle("RVV")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var n3 = intent.extras?.getString(MainActivity().TAG_n3)
        var n4 = intent.extras?.getString(MainActivity().TAG_n4)
        var n5 = intent.extras?.getString(MainActivity().TAG_n5)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_n3.setText(n3)
        tv_res_n4.setText(n4)
        tv_res_n5.setText(n5)

        btn_back.setOnClickListener {
            finish()
        }
    }
}