package com.codemen.message

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter :MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MainAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val dummyList:MutableList<Usuario> = mutableListOf<Usuario>()
            dummyList.add(
                Usuario(
                0,
                "https://cnet3.cbsistatic.com/img/rXiMv36qP-h-c9SF4nwaPxoSn5U=/2019/08/22/6cce6de4-4eaf-40e4-9acf-30dd4a4d0f1a/android-10.png",
                    "Prueba Tecnica",
                "qwertyuiopasdfghjklzxcvbnm"

            )
            )

        dummyList.add(
            Usuario(
                0,
                "https://cnet3.cbsistatic.com/img/rXiMv36qP-h-c9SF4nwaPxoSn5U=/2019/08/22/6cce6de4-4eaf-40e4-9acf-30dd4a4d0f1a/android-10.png",
                "Prueba Tecnica2",
                "qwertyuiopasdfghjklzxcvbnmwer"

            )
        )

        dummyList.add(
            Usuario(
                0,
                "https://upload.wikimedia.org/wikipedia/commons/d/d7/Android_robot.svg",
                "Prueba Tecnica3",
                "qwertyuiopasdfghjklzx"

            )
        )

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()
    }
}
