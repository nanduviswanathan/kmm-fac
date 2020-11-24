package com.example.myapplication.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.shared.Greeting
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.androidApp.R.layout.activity_main
import com.example.myapplication.shared.Factorial

//fun greet(): String {
//    return Greeting().greeting()
//}
//
//fun main(args: Array<String>) {
//
//    val num = 10
//    var factorial: Long = 1
//    for (i in 1..num) {
//        // factorial = factorial * i;
//        factorial *= i.toLong()
//    }
//    println("Factorial of $num = $factorial")
//}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val tv: TextView = findViewById(R.id.btnFacResult)
        tv.text = "factorial"

//       // val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        //tv.setOnClickListener()
//
////        tv.setOnClickListener(object : View.OnClickListener{
////            override fun onClick(v: View?) {
////                //Your code here
////                Toast.makeText(this, "Hello welcome",Toast.LENGTH_SHORT).show()
////            }})
//
//        tv.setOnClickListener {
//            Log.i(TAG, "Button was clicked !")
//            showToast(resources.getString(R.string.btn_was_clicked), Toast.LENGTH_LONG)
//        }


        tv.setOnClickListener{
            val fac = Factorial().main()
            Toast.makeText(this, fac.toString(), Toast.LENGTH_SHORT).show()

        }




    }
}
