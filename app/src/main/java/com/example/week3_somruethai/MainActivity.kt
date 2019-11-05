package com.example.week3_somruethai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public final var TAG_FNAME = "FNAME"
    public final  var TAG_LNAME = "LNAME"
    public final var TAG_n3 = "n3"
    public final  var TAG_n4 = "n4"
    public final var TAG_n5 = "n5"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("AppTest")
        btn_sender.setOnClickListener{
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var n3 = et_n3.text.toString()
            var n4 = et_n4.text.toString()
            var n5 = et_n5.text.toString()

            senderFun(fname,lname,n3,n4,n5)
        }
        btn_clear.setOnClickListener{
            et_fname.setText("")
            et_lname.setText("")
            et_n3.setText("")
            et_n4.setText("")
            et_n5.setText("")
        }
        btn_close.setOnClickListener{
            finish()
        }
    }

    fun senderFun(arg1 : String , arg2 : String, arg3 : String, arg4 : String, arg5 : String){
            var goPageSecond = Intent(this,SecondActivity ::class.java)
            goPageSecond.putExtra(TAG_FNAME,arg1)
            goPageSecond.putExtra(TAG_LNAME,arg2)
            goPageSecond.putExtra(TAG_n3,arg3)
            goPageSecond.putExtra(TAG_n4,arg4)
            goPageSecond.putExtra(TAG_n5,arg5)
            startActivity(goPageSecond)
    }
}
