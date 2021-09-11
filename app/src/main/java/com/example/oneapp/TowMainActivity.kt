package com.example.oneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_tow.*
import kotlin.random.Random

class TowMainActivity : AppCompatActivity() {

   companion object{
       const val  TOTAL_COUNT = "total_count"
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tow)
        showRandom()
    }

    fun showRandom ()
    {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)



        val random = Random(100)
        var randomInt = 0

        if (count > 0)
        {
            randomInt = random.nextInt(count+1)
            textViewRandom.text = Integer.toString(randomInt)
            textViewTextScreen.text = getString(R.string.random_edit, count)
        }
        else
        {
            textViewRandom.text = "Укажите не отрицательное число!"
            textViewTextScreen.text = getString(R.string.random_edit, 0)
        }

    }




}
