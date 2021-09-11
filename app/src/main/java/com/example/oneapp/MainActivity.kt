package com.example.oneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_tow.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun message(view: View)
     {
         val myMessage = Toast.makeText(this, "blat", Toast.LENGTH_SHORT)
         myMessage.show()
     }

    fun countUp (view: View)
    {
        var count: Int = Integer.parseInt(textView2.text.toString())
        count++
        textView2.text=count.toString()


    }

    fun countDown (view: View)
    {
        var count: Int = Integer.parseInt(textView2.text.toString())
        count--
        textView2.text = count.toString()
    }

    fun randomMe (view: View)
    {
        val randomIntent = Intent (this, TowMainActivity::class.java)
        //startActivity(randomIntent)

        val count = Integer.parseInt(textView2.text.toString())
        randomIntent.putExtra(TowMainActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)

    }
}
