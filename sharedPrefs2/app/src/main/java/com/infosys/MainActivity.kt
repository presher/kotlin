package com.infosys

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var sp : SharedPreferences
        var filename = "My File"
        var key_username = "Username"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp = getSharedPreferences(filename, Context.MODE_PRIVATE)
        var editor = sp.edit()

        save.setOnClickListener(){
            editor.putString(key_username, uname.text.toString())
            editor.commit()
            uname.setText()
        }

        load.setOnClickListener(){
            uname.setText(sp.getString(key_username, "No Data"))
        }

        delete.setOnClickListener(){
            editor.clear()
            editor.commit()
        }
    }
}