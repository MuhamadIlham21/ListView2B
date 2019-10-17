package com.app.id.mylistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.id.mylistview.Adapter.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val bahasa = arrayOf<String>("Ruby", "Rails", "Python", "JavaScript", "PHP")
    val deskripsi = arrayOf<String>(
        "Ruby is an open-source and fully onject-oriented progamming language.",
        "Ruby on Rails is a server-side web aplication development framework written in Ruby language.",
        "Python is interpreted scripting and object-oriented progamming language.",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language i.e., there is no need for compilation"
    )

    val imageId = arrayOf<Int>(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = AdapterB(this,bahasa,deskripsi,imageId)
        lvLatihanB.adapter = myListAdapter
    }
}
