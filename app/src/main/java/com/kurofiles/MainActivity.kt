package com.kurofiles

import android.os.Bundle
import android.os.Environment
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {

    lateinit var fileList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fileList = findViewById(R.id.fileList)

        val path = Environment.getExternalStorageDirectory()
        val files = path.listFiles()

        val data = ArrayList<String>()

        files?.forEach {
            if(it.isDirectory){
                data.add("📁 "+it.name)
            } else {
                data.add("📄 "+it.name)
            }
        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        fileList.adapter = adapter
    }
}