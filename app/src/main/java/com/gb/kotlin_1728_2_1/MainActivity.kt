package com.gb.kotlin_1728_2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val person = Person(age=20,name="Pavel",bio="bidsewgerswg", bio2 ="sdgsgr")
        val person2 = Person("Pavel",12,"bio","bio2")
        Log.d("mylogs","${person.name}")
        Log.d("mylogs","$test")
        test = "NewTest"
        Log.d("mylogs","$test")
    }
}
